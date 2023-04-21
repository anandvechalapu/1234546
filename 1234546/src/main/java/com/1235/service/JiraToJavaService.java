package com.1235.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1235.repository.JiraToJavaRepository;
import com.1235.model.JiraConnection;

@Service
public class JiraToJavaService {
    @Autowired
    private JiraToJavaRepository jiraToJavaRepository;
 
    public List<JiraConnection> findByProject(String project) {
        return jiraToJavaRepository.findByProject(project);
    }
 
    public List<JiraConnection> findByMicroserviceImplementationType(String microserviceImplementationType) {
        return jiraToJavaRepository.findByMicroserviceImplementationType(microserviceImplementationType);
    }
 
    public List<JiraConnection> findByUserStories(String userStories) {
        return jiraToJavaRepository.findByUserStories(userStories);
    }
 
    public List<JiraConnection> findByJavaCodeType(String javaCodeType) {
        return jiraToJavaRepository.findByJavaCodeType(javaCodeType);
    }
 
    public List<JiraConnection> findByGitHub(String gitHub) {
        return jiraToJavaRepository.findByGitHub(gitHub);
    }
 
    public List<JiraConnection> findByRepositoryName(String repositoryName) {
        return jiraToJavaRepository.findByRepositoryName(repositoryName);
    }
}