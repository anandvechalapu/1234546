package com.1235.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.1235.service.BranchesService;
import com.1235.model.Branches;

@RestController
@RequestMapping("/branches")
public class BranchesController {
	
	@Autowired
	private BranchesService branchesService;
	
	@GetMapping("/all")
	public List<Branches> findAll(){
		return branchesService.findAll();
	}

	@GetMapping("/byNumberAndWholesaler")
	public Branches findByNumberAndWholesaler(@RequestParam String number, @RequestParam String wholesaler){
		return branchesService.findByNumberAndWholesaler(number, wholesaler);
	}

	@PostMapping("/save")
	public Branches save(@RequestBody Branches branch){
		return branchesService.save(branch);
	}

	@PutMapping("/edit")
	public Branches edit(@RequestBody Branches branch){
		return branchesService.edit(branch);
	}

	@PostMapping("/download")
	public void download(@RequestParam String number, @RequestParam String wholesaler){
		branchesService.download(number, wholesaler);
	}

	@PostMapping("/delete")
	public void deleteByNumberAndWholesaler(@RequestParam String number, @RequestParam String wholesaler){
		branchesService.deleteByNumberAndWholesaler(number, wholesaler);
	}

}