package edu.nju.careerbridge.youth.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import edu.nju.careerbridge.youth.model.ProjectExperience;
import edu.nju.careerbridge.youth.model.Skill;

import javax.transaction.Transactional;
import java.util.List;


public interface SkillRepository extends JpaRepository<Skill, Integer> {


    @Transactional
    void deleteByPhone(@Param("phone") String phone);

    List<Skill> findByPhone(String phone);

}
