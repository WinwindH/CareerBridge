package edu.nju.careerbridge.youth.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import edu.nju.careerbridge.youth.model.Education;
import edu.nju.careerbridge.youth.model.JobExperience;
import edu.nju.careerbridge.youth.model.ProjectExperience;

import javax.transaction.Transactional;
import java.util.List;


public interface ProjectExperienceRepository extends JpaRepository<ProjectExperience, Integer> {


    @Transactional
    void deleteByPhone(@Param("phone") String phone);

    List<ProjectExperience> findByPhone(String phone);

}
