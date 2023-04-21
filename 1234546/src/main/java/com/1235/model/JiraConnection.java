package com.1235.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="jira_connection")
public class JiraConnection {

    @Id
    private Integer jiraId;
    private String jiraConnection;
    private String project;

    public Integer getJiraId() {
        return jiraId;
    }

    public void setJiraId(Integer jiraId) {
        this.jiraId = jiraId;
    }

    public String getJiraConnection() {
        return jiraConnection;
    }

    public void setJiraConnection(String jiraConnection) {
        this.jiraConnection = jiraConnection;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}

@Entity
@Table(name="project")
public class Project {

    @Id
    private Integer projectId;
    private String project;
    private List<String> userStories;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<String> getUserStories() {
        return userStories;
    }

    public void setUserStories(List<String> userStories) {
        this.userStories = userStories;
    }
}

@Entity
@Table(name="user_story")
public class UserStory {

    @Id
    private Integer userStoryId;
    private String userStory;
    private String typeOfSalesforceCode;

    public Integer getUserStoryId() {
        return userStoryId;
    }

    public void setUserStoryId(Integer userStoryId) {
        this.userStoryId = userStoryId;
    }

    public String getUserStory() {
        return userStory;
    }

    public void setUserStory(String userStory) {
        this.userStory = userStory;
    }

    public String getTypeOfSalesforceCode() {
        return typeOfSalesforceCode;
    }

    public void setTypeOfSalesforceCode(String typeOfSalesforceCode) {
        this.typeOfSalesforceCode = typeOfSalesforceCode;
    }
}

@Entity
@Table(name="type_of_salesforce_code")
public class TypeOfSalesforceCode {

    @Id
    private Integer typeOfSalesforceCodeId;
    private String typeOfSalesforceCode;
    private String gitHub;

    public Integer getTypeOfSalesforceCodeId() {
        return typeOfSalesforceCodeId;
    }

    public void setTypeOfSalesforceCodeId(Integer typeOfSalesforceCodeId) {
        this.typeOfSalesforceCodeId = typeOfSalesforceCodeId;
    }

    public String getTypeOfSalesforceCode() {
        return typeOfSalesforceCode;
    }

    public void setTypeOfSalesforceCode(String typeOfSalesforceCode) {
        this.typeOfSalesforceCode = typeOfSalesforceCode;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }
}

@Entity
@Table(name="git_hub")
public class GitHub {

    @Id
    private Integer gitHubId;
    private String gitHub;
    private String repositoryName;

    public Integer getGitHubId() {
        return gitHubId;
    }

    public void setGitHubId(Integer gitHubId) {
        this.gitHubId = gitHubId;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getRepositoryName() {