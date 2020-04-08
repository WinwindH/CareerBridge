package edu.nju.careerbridge.youth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import edu.nju.careerbridge.youth.model.ExpectLocation;
import edu.nju.careerbridge.youth.model.Honor;

import javax.transaction.Transactional;
import java.util.List;


public interface ExpectLocationRepository extends JpaRepository<ExpectLocation, Integer> {


    @Transactional
    void deleteByPhone(@Param("phone") String phone);

    List<ExpectLocation> findByPhone(String phone);


}
