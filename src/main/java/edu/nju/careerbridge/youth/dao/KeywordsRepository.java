package edu.nju.careerbridge.youth.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import edu.nju.careerbridge.youth.model.Keywords;

import java.util.List;


public interface KeywordsRepository extends JpaRepository<Keywords, String>,JpaSpecificationExecutor<Keywords>{


    @Query(value = "SELECT * from keywords u WHERE u.keywords LIKE %?1%", nativeQuery = true)
    List<Keywords> findThroughKey(String keywords );

}
