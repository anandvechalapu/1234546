package com.1235.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.1235.model.Branches;
import com.1235.service.BranchesService;

@RestController
@RequestMapping("/branches")
public class BranchesController {

	@Autowired
	private BranchesService branchesService;
	
	@GetMapping
	public List<Branches> getBranches() {
		return branchesService.getBranches();
	}
	
	@GetMapping("/{id}")
	public Optional<Branches> getBranchesById(@PathVariable Long id) {
		return branchesService.getBranchesById(id);
	}
	
	@GetMapping("/name-wholesaler")
	public Branches getBranchesByNameAndWholesaler(@RequestParam String name, @RequestParam String wholesaler) {
		return branchesService.getBranchesByNameAndWholesaler(name, wholesaler);
	}
	
	@GetMapping("/wholesaler-number")
	public Branches getBranchesByWholesalerAndNumber(@RequestParam String wholesaler, @RequestParam Integer number) {
		return branchesService.getBranchesByWholesalerAndNumber(wholesaler, number);
	}
	
	@GetMapping("/nfrn-tv-noaatsat")
	public Branches getBranchesByNFRNRegionAndTVRegionAndNoAATSATValues(@RequestParam String nfrnRegion, @RequestParam String tvRegion, @RequestParam String noAATSATValues) {
		return branchesService.getBranchesByNFRNRegionAndTVRegionAndNoAATSATValues(nfrnRegion, tvRegion, noAATSATValues);
	}
	
	@GetMapping("/active")
	public Branches getBranchesByActive(@RequestParam String active) {
		return branchesService.getBranchesByActive(active);
	}
	
	@GetMapping("/date-created-last-modified")
	public Branches getBranchesByDateCreatedAndLastModified(@RequestParam String dateCreated, @RequestParam String lastModified) {
		return branchesService.getBranchesByDateCreatedAndLastModified(dateCreated, lastModified);
	}
	
	@PostMapping
	public Branches createBranches(@RequestBody Branches branches) {
		return branchesService.createBranches(branches);
	}
	
	@PutMapping
	public Branches updateBranches(@RequestBody Branches branches) {
		return branchesService.updateBranches(branches);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBranches(@PathVariable Long id) {
		branchesService.deleteBranches(id);
	}

}