@Service
public class BranchesService {
	@Autowired
	private BranchesRepository branchesRepository;
	
	public List<Branches> findAll(){
		return branchesRepository.findAll();
	}

	public Branches findByNumberAndWholesaler(String number, String wholesaler){
		return branchesRepository.findByNumberAndWholesaler(number, wholesaler);
	}

	public Branches save(Branches branch){
		return branchesRepository.save(branch);
	}

	public Branches edit(Branches branch){
		return branchesRepository.edit(branch);
	}

	public void download(String number, String wholesaler){
		branchesRepository.download(number, wholesaler);
	}

	public void deleteByNumberAndWholesaler(String number, String wholesaler){
		branchesRepository.deleteByNumberAndWholesaler(number, wholesaler);
	}

	public boolean hasPermission(String userId){
		//Check user permission
		//If user has permission, return true
		//If user doesn't have permission, return false
		return true;
	}
}