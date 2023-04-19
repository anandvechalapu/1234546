·       Ability to find the sub functionalities like create, edit, view and download when you click branch functionality.·       Ability to access the sub functionalities like create, edit, view and download.·       User should have Submit and Reset buttons on this screen.·       If user has permission then he should able to access this page.·       If user didn’t have permission then redirect to login page. 

@Repository
public interface BranchesRepository extends JpaRepository<Branches, String> {
    //Find all branches
    List<Branches> findAll();

    //Find branch by ID
    Branches findByNumberAndWholesaler(String number, String wholesaler);

    //Create branch
    Branches save(Branches branch);

    //Edit branch
    Branches edit(Branches branch);

    //Download branch
    void download(String number, String wholesaler);

    //Delete branch
    void deleteByNumberAndWholesaler(String number, String wholesaler);
}