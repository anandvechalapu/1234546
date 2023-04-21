package com.1235.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JiraToSalesForceRepository extends JpaRepository<JiraConnection, Integer> {

    @Query("SELECT project FROM JiraConnection WHERE jira_connection = ?1")
    Project getProjectByJiraConnection(String jiraConnection);

    @Query("SELECT user_stories FROM Project WHERE project = ?1")
    List<String> getUserStoriesByProject(String project);

    @Query("SELECT type_of_salesforce_code FROM UserStory WHERE user_story = ?1")
    String getTypeOfSalesforceCodeByUserStory(String userStory);

    @Query("SELECT git_hub FROM TypeOfSalesforceCode WHERE type_of_salesforce_code = ?1")
    String getGitHubByTypeOfSalesforceCode(String typeOfSalesforceCode);

    @Query("SELECT repository_name FROM GitHub WHERE git_hub = ?1")
    String getRepositoryNameByGitHub(String gitHub);

}