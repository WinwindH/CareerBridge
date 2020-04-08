package edu.nju.careerbridge.youth.blservice;

import edu.nju.careerbridge.youth.bean.*;

public interface CompanyBLService {

    ResultMessageBean companyRemark(String phone,String company,int recomandScore,
                                           int futureScore,int ceoScore, String remark);
    CompanyRemarkBean getCompanyRemark(String company);
    ResultMessageBean interviewRemark(String phone,String company,String result,
                                             int difficulty,int feeling,String remark);
    CompanyInterviewRemarkBean getInterviewRemark(String company);
    JobDetailBean getJobDetailByJobId( String jobId);

}
