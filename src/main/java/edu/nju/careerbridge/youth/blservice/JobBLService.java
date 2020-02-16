package edu.nju.careerbridge.youth.blservice;

import edu.nju.careerbridge.youth.bean.ResultMessageBean;

public interface JobBLService {

    ResultMessageBean scanJob(String phone, String jobId);
    ResultMessageBean likeJob(String phone, String jobId);
    ResultMessageBean dislikeJob(String phone, String jobId);
    ResultMessageBean cancelLikeJob(String phone, String jobId);

}

