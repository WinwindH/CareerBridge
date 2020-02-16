package edu.nju.careerbridge.youth.blservice;

import org.springframework.web.bind.annotation.RequestBody;
import edu.nju.careerbridge.youth.bean.JobListBean;
import edu.nju.careerbridge.youth.bean.SearchBean;

import java.util.List;

public interface JobListBLService {


    List<JobListBean> getSavedJobList(String phone);
    List<JobListBean> getRecomandJobList(String phone);
    edu.nju.careerbridge.util.Page<JobListBean> searchJob(@RequestBody SearchBean searchBean);

}

