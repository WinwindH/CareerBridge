package edu.nju.careerbridge.youth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_classification")
public class JobClassification {


    @Column(name = "job_id")
    @Id
    private String jobId;


    @Column(name = "job_name")
    private String jobName;

    /**
     * 分类
     */
    @Column(name = "classification")
    private Integer classification;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "JobClassification{" +
                "jobId='" + jobId + '\'' +
                ", jobName='" + jobName + '\'' +
                ", classification=" + classification +
                '}';
    }
}

