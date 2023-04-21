package com.1235.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.1235.model.JiraConnection;
import com.1235.service.JiraToJavaService;
import com.1235.service.JiraToSalesForceService;

@RestController
public class JiraController {
	
	@Autowired
	private JiraToJavaService jiraToJavaService;
	
	@Autowired
	private JiraToSalesForceService jiraToSalesForceService;
	
	@GetMapping(value="/projects/{jiraConnection}")
	public Project getProjectByJiraConnection(@PathVariable String jiraConnection) {
		return jiraToSalesForceService.getProjectByJiraConnection(jiraConnection);
	}
	
	@GetMapping(value="/userStories/{project}")
	public List<String> getUserStoriesByProject(@PathVariable String project) {
		return jiraToSalesForceService.getUserStoriesByProject(project);
	}
	
	@GetMapping(value="/typeOfSalesforceCode/{userStory}")
	public String getTypeOfSalesforceCodeByUserStory(@PathVariable String userStory) {
		return jiraToSalesForceService.getTypeOfSalesforceCodeByUserStory(userStory);
	}
	
	@GetMapping(value="/gitHub/{typeOfSalesforceCode}")
	public String getGitHubByTypeOfSalesforceCode(@PathVariable String typeOfSalesforceCode) {
		return jiraToSalesForceService.getGitHubByTypeOfSalesforceCode(typeOfSalesforceCode);
	}
	
	@GetMapping(value="/repositoryName/{gitHub}")
	public String getRepositoryNameByGitHub(@PathVariable String gitHub) {
		return jiraToSalesForceService.getRepositoryNameByGitHub(gitHub);
	}
	
	@GetMapping(value="/jiraToJava/{project}")
	public List<JiraConnection> findByProject(@PathVariable String project) {
		return jiraToJavaService.findByProject(project);
	}
	
	@GetMapping(value="/jiraToJava/{microserviceImplementationType}")
	public List<JiraConnection> findByMicroserviceImplementationType(@PathVariable String microserviceImplementationType) {
		return jiraToJavaService.findByMicroserviceImplementationType(microserviceImplementationType);
	}
	
	@GetMapping(value="/jiraToJava/{userStories}")
	public List<JiraConnection> findByUserStories(@PathVariable String userStories) {
		return jiraToJavaService.findByUserStories(userStories);
	}
	
	@GetMapping(value="/jiraToJava/{javaCodeType}")
	public List<JiraConnection> findByJavaCodeType(@PathVariable String javaCodeType) {
		return jiraToJavaService.findByJavaCodeType(javaCodeType);
	}
	
	@GetMapping(value="/jiraToJava/{gitHub}")
	public List<JiraConnection> findByGitHub(@PathVariable String gitHub) {
		return jiraToJavaService.findByGitHub(gitHub);
	}
	
	@GetMapping(value="/jiraToJava/{repositoryName}")
	public List<JiraConnection> findByRepositoryName(@PathVariable String repositoryName) {
		return jiraToJavaService.findByRepositoryName(repositoryName);
	}
	
	@PostMapping(value="/jiraToJava/create")
	public JiraConnection createJiraConnection(@RequestBody JiraConnection jiraConnection) {
		return jiraTo