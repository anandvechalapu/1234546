·       Ability to select the date, month, year from the calendar.·       Data should be displayed as per selection done by the user.

trigger SelectDate on Account(before insert, before update){
 
    Map<String, Schema.SObjectField> fields = Schema.SObjectType.Account.fields.getMap();
    
    //Create a list to store the Date/Time fields
    List<Schema.SObjectField> dateFields = new List<Schema.SObjectField>();
     
    //Loop through the fields and check for Date/Time type fields
    for (String fieldName : fields.keySet()) {
        if (fields.get(fieldName).getDescribe().getType() == Schema.DisplayType.Date) {
            dateFields.add(fields.get(fieldName));
        }
    }
     
    //Loop through the records and check if the Date/Time field is set
    for (Account acc : Trigger.new) {
        for (Schema.SObjectField dateField : dateFields) {
            if (acc.get(dateField) == null) {
                
                //Create a calendar page with Date/Time field
                PageReference pageRef = Page.Calendar;
                pageRef.getParameters().put('accId', acc.Id);
                pageRef.getParameters().put('dateField', dateField.getDescribe().getName());
                 
                //Throw an error and redirect to the calendar page
                acc.addError(dateField.getDescribe().getLabel() + ' cannot be blank.');
                ApexPages.addMessage(new ApexPages.Message(ApexPages.Severity.FATAL, 
                    'Please select the ' + dateField.getDescribe().getLabel() + '.',
                    pageRef.getUrl()));
            }
        }
    }
}