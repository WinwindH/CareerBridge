package edu.nju.careerbridge.youth.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import edu.nju.careerbridge.youth.model.Expectation;
import edu.nju.careerbridge.youth.model.Skill;

import javax.transaction.Transactional;
import java.util.List;


public interface ExpectationRepository extends JpaRepository<Expectation, Integer> {


    @Transactional
    void deleteByPhone(@Param("phone") String phone);

    Expectation findByPhone(String phone);

}
