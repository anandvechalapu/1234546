·       Ability to access the sub screens like create, edit, view and download function.·       Ability to select wholesaler from the wholesalers list.·       Ability to select NFRN Region from the NFRN Regions List.·       Ability to select TV Region from the TV Regions List.·       Ability to select No. AAT/SAT value from dropdown.·       Ability to submit the branch.·       Ability to reset the branch.·       Number should be in this pattern "/^\d+$/". - - {number, wholesaler} is the composite key and should be unique.

package com.1235.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.1235.model.Branches;

public interface BranchesRepository extends JpaRepository<Branches, Long> {
    Branches findByWholesalerAndNumber(String wholesaler, Integer number);
    Branches findByNameAndWholesaler(String name, String wholesaler);
    Branches findByNFRNRegionAndTVRegionAndNoAATSATValues(String nfrnRegion, String tvRegion, String noAATSATValues);
    Branches findByActive(String active);
    Branches findByDateCreatedAndLastModified(String dateCreated, String lastModified);
}