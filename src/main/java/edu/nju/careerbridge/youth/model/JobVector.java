package edu.nju.careerbridge.youth.model;

import javax.persistence.*;

@Entity
@Table(name = "job_vector_2")
public class JobVector {

    @Id
    @Column(name = "job_id")
    private Integer jobId;

    /**
     * 平均薪资
     */
    @Column(name = "salary_mid")
    private Integer salaryMid;

    /**
     * 公司性质
     */
    @Column(name = "company_nature")
    private Integer companyNature;

    /**
     * 教育水平
     */
    @Column(name = "education_degree")
    private Integer educationDegree;

    /**
     * 教育经历
     */
    @Column(name = "job_exp")
    private Double jobExp;

    @Column(name = "lng")
    private Double lng;

    @Column(name = "lat")
    private Double lat;

    /**
     * 城市
     */
    @Column(name = "job_city")
    private String jobCity;

    /**
     * 名称
     */
    @Column(name = "job_name")
    private String jobName;

    public JobVector(){

    }

    public JobVector(Integer jobId, Integer salaryMid, Integer companyNature, Integer educationDegree, Double jobExp, Double lng, Double lat, String jobCity, String jobName) {
        this.jobId = jobId;
        this.salaryMid = salaryMid;
        this.companyNature = companyNature;
        this.educationDegree = educationDegree;
        this.jobExp = jobExp;
        this.lng = lng;
        this.lat = lat;
        this.jobCity = jobCity;
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "JobVector{" +

                ", jobId='" + jobId + '\'' +
                ", salaryMid='" + salaryMid + '\'' +
                ", companyNature='" + companyNature + '\'' +
                ", educationDegree='" + educationDegree + '\'' +
                ", jobExp='" + jobExp + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", jobCity='" + jobCity + '\'' +
                '}';
    }


    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getSalaryMid() {
        return salaryMid;
    }

    public void setSalaryMid(Integer salaryMid) {
        this.salaryMid = salaryMid;
    }

    public Integer getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(Integer companyNature) {
        this.companyNature = companyNature;
    }

    public Integer getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(Integer educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Double getJobExp() {
        return jobExp;
    }

    public void setJobExp(Double jobExp) {
        this.jobExp = jobExp;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getJobCity() {
        return jobCity;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}

