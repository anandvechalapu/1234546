package com.1235.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1235.model.Branches;
import com.1235.repository.BranchesRepository;

@Service
public class BranchesService {
	
	@Autowired
	private BranchesRepository branchesRepository;
	
	public List<Branches> getBranches() {
		return branchesRepository.findAll();
	}
	
	public Optional<Branches> getBranchesById(Long id) {
		return branchesRepository.findById(id);
	}
	
	public Branches getBranchesByWholesalerAndNumber(String wholesaler, Integer number) {
		return branchesRepository.findByWholesalerAndNumber(wholesaler, number);
	}
	
	public Branches getBranchesByNameAndWholesaler(String name, String wholesaler) {
		return branchesRepository.findByNameAndWholesaler(name, wholesaler);
	}
	
	public Branches getBranchesByNFRNRegionAndTVRegionAndNoAATSATValues(String nfrnRegion, String tvRegion, String noAATSATValues) {
		return branchesRepository.findByNFRNRegionAndTVRegionAndNoAATSATValues(nfrnRegion, tvRegion, noAATSATValues);
	}
	
	public Branches getBranchesByActive(String active) {
		return branchesRepository.findByActive(active);
	}
	
	public Branches getBranchesByDateCreatedAndLastModified(String dateCreated, String lastModified) {
		return branchesRepository.findByDateCreatedAndLastModified(dateCreated, lastModified);
	}
	
	public Branches createBranches(Branches branches) {
		return branchesRepository.save(branches);
	}
	
	public Branches updateBranches(Branches branches) {
		return branchesRepository.save(branches);
	}
	
	public void deleteBranches(Long id) {
		branchesRepository.deleteById(id);
	}

}