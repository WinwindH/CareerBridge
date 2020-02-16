package edu.nju.careerbridge.youth.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import edu.nju.careerbridge.youth.model.JobVector;


public interface JobVectorRepository extends JpaRepository<JobVector, Integer>,JpaSpecificationExecutor<JobVector>{

//    JobVector findByJobCity(String jobCity);


}
