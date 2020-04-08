package edu.nju.careerbridge.youth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.nju.careerbridge.youth.model.SingleCompanyRemark;
import edu.nju.careerbridge.youth.model.SingleInterviewRemark;

import java.util.List;


public interface SingleInterviewRemarkRepository extends JpaRepository<SingleInterviewRemark, Integer> {


//    @Transactional
//    void deleteByPhone(@Param("phone") String phone);

    List<SingleInterviewRemark>  findByCompany(String company);


}
