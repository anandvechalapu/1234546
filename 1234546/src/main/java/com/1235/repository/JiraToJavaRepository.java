package com.1235.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JiraToJavaRepository extends JpaRepository<JiraConnection, Long> { 
    List<JiraConnection> findByProject(String project); 
    List<JiraConnection> findByMicroserviceImplementationType(String microserviceImplementationType); 
    List<JiraConnection> findByUserStories(String userStories); 
    List<JiraConnection> findByJavaCodeType(String javaCodeType); 
    List<JiraConnection> findByGitHub(String gitHub); 
    List<JiraConnection> findByRepositoryName(String repositoryName); 
}