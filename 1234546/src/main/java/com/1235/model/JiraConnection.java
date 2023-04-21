package com.1235.model; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JiraConnection {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String project;
    private String microserviceImplementationType;
    private String userStories;
    private String javaCodeType;
    private String gitHub;
    private String repositoryName;

    public JiraConnection() {
    }

    public JiraConnection(String project, String microserviceImplementationType, String userStories, String javaCodeType, String gitHub, String repositoryName) {
        this.project = project;
        this.microserviceImplementationType = microserviceImplementationType;
        this.userStories = userStories;
        this.javaCodeType = javaCodeType;
        this.gitHub = gitHub;
        this.repositoryName = repositoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getMicroserviceImplementationType() {
        return microserviceImplementationType;
    }

    public void setMicroserviceImplementationType(String microserviceImplementationType) {
        this.microserviceImplementationType = microserviceImplementationType;
    }

    public String getUserStories() {
        return userStories;
    }

    public void setUserStories(String userStories) {
        this.userStories = userStories;
    }

    public String getJavaCodeType() {
        return javaCodeType;
    }

    public void setJavaCodeType(String javaCodeType) {
        this.javaCodeType = javaCodeType;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
}