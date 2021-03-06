package edu.nju.careerbridge.youth.model;

import javax.persistence.*;

@Entity
@Table(name = "job_dislike")
public class DisLikedJob {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private int id;




    @Column(name = "phone")
    private String phone;

    @Column(name = "job_id")
    private String jobId;

    public DisLikedJob(){

    }

    public DisLikedJob(String phone, String jobId) {
        this.phone = phone;
        this.jobId = jobId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}

