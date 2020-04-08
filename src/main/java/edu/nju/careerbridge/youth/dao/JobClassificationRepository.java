package edu.nju.careerbridge.youth.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import edu.nju.careerbridge.youth.model.JobClassification;
import edu.nju.careerbridge.youth.model.Keywords;


public interface JobClassificationRepository extends JpaRepository<JobClassification, String>,JpaSpecificationExecutor<JobClassification>{

   //JobClassification findByKeywords(String keywords);

}
