package edu.nju.careerbridge.youth.blservice;

import org.springframework.web.bind.annotation.RequestBody;
import edu.nju.careerbridge.youth.bean.JobListBean;
import edu.nju.careerbridge.youth.bean.SearchBean;

import java.util.List;

public interface JobListBLService {


    public List<JobListBean> getSavedJobList(String phone);
    public List<JobListBean> getRecomandJobList(String phone);
    public edu.nju.careerbridge.util.Page<JobListBean> searchJob(@RequestBody SearchBean searchBean);
    public edu.nju.careerbridge.util.Page<JobListBean> search(String keyword,int page,int num);

}

