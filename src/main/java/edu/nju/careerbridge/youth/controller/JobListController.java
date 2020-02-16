package edu.nju.careerbridge.youth.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.nju.careerbridge.youth.bean.JobListBean;
import edu.nju.careerbridge.youth.bean.SearchBean;
import edu.nju.careerbridge.youth.blservice.JobListBLService;

import java.util.List;
import java.util.Map;

@Api(value = "职业列表模块", description = "职业列表相关接口")
@RestController
@RequestMapping("/joblist")
public class JobListController {

    @Autowired
    private JobListBLService jobListBLService;
    @Autowired
    public JobListController(JobListBLService jobListBLService){
        this.jobListBLService=jobListBLService;

    }

      /*
    得到收藏职业列表
     */

    @ApiOperation(value = "得到收藏职业列表", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),

    })
    @PostMapping("/save/get")
    public List<JobListBean> getSavedJobList(@RequestBody String phone) {
        JSONObject jo = new JSONObject();
        Map<String, Object> m=(Map<String, Object> )jo.parse(phone);
        return jobListBLService.getSavedJobList((String)m.get("phone"));

    }

       /*
    得到推荐职业列表
     */

    @ApiOperation(value = "得到推荐职业列表", notes = "可能状态码：0,1,9<br>登录成功返回签名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String"),

    })
    @PostMapping("/recomand/get")
    public List<JobListBean> getRecomandJobList(@RequestBody String param) {
        JSONObject jo = new JSONObject();
        Map<String, Object> m=(Map<String, Object> )jo.parse(param);
        return jobListBLService.getRecomandJobList((String) m.get("phone"));
    }

//       /*
//    搜索职业
//
//     */
//
    @ApiOperation(value = "搜索职业", notes = "可能状态码：0,1,9<br>登录成功返回签名")

    @PostMapping("/job/search")
    public edu.nju.careerbridge.util.Page<JobListBean> searchJob(@RequestBody String param) {
        JSONObject jo = new JSONObject();
        Map<String, Object> m=(Map<String, Object> )jo.parse(param);
        JSONArray ja = JSONArray.parseArray((String)m.get("jobCity"));
        String [] jobCityArr = new String[ja.size()];
        for (int i = 0; i < ja.size(); i++) {
            jobCityArr[i] = (String)ja.get(i);
        }
        String jobName = null;

        SearchBean searchBean = new SearchBean(jobName, Integer.parseInt((String)m.get("salary")), jobCityArr, (String) m.get("jobQuality"),
                (String) m.get("eduRequire"), Double.parseDouble((String) m.get("workYear")), (Integer) m.get("page"), (Integer) m.get("num"));
        return jobListBLService.searchJob(searchBean);
}


}

