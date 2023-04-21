package com.1235.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1235.model.JiraConnection;
import com.1235.model.Project;
import com.1235.model.TypeOfSalesforceCode;
import com.1235.model.UserStory;
import com.1235.repository.JiraToSalesForceRepository;

@Service
public class JiraToSalesForceService {

    @Autowired
    private JiraToSalesForceRepository jiraRepository;

    public Project getProjectByJiraConnection(String jiraConnection) {
        return jiraRepository.getProjectByJiraConnection(jiraConnection);
    }

    public List<String> getUserStoriesByProject(String project) {
        return jiraRepository.getUserStoriesByProject(project);
    }

    public String getTypeOfSalesforceCodeByUserStory(String userStory) {
        return jiraRepository.getTypeOfSalesforceCodeByUserStory(userStory);
    }

    public String getGitHubByTypeOfSalesforceCode(String typeOfSalesforceCode) {
        return jiraRepository.getGitHubByTypeOfSalesforceCode(typeOfSalesforceCode);
    }

    public String getRepositoryNameByGitHub(String gitHub) {
        return jiraRepository.getRepositoryNameByGitHub(gitHub);
    }

}