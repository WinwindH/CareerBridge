package edu.nju.careerbridge.youth.model;

import javax.persistence.*;

@Entity
@Table(name = "user_basic_message")
public class UserBasicMessage {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Integer id;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 性别
     */
    private String gender;

    /**
     * 地址
     */
    private String address;

    /**
     * 工作年份
     */
    private Double jobYear;

    /**
     * 薪酬
     */
    private String salary;

    /**
     * 最低薪酬
     */
    private Integer lowSalary;

    /**
     * 最高薪酬
     */
    private Integer highSalary;

    /**
     * 基本薪酬
     */
    private Integer basicSalary;

    /**
     * 奖金
     */
    private Integer bonus;

    /**
     * 佣金
     */
    private Integer commission;

    /**
     * 股票购股权
     */
    private Integer stockShareOption;

    public UserBasicMessage(){

    }

    public UserBasicMessage(String phone, String realName, String birthday, String gender, String address,
                            Double jobYear, String salary, Integer lowSalary, Integer highSalary,
                            Integer basicSalary, Integer bonus, Integer commission, Integer stockShareOption) {
        this.phone = phone;
        this.realName = realName;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.jobYear = jobYear;
        this.salary = salary;
        this.lowSalary = lowSalary;
        this.highSalary = highSalary;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.commission = commission;
        this.stockShareOption = stockShareOption;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getJobYear() {
        return jobYear;
    }

    public void setJobYear(Double jobYear) {
        this.jobYear = jobYear;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Integer getLowSalary() {
        return lowSalary;
    }

    public void setLowSalary(Integer lowSalary) {
        this.lowSalary = lowSalary;
    }

    public Integer getHighSalary() {
        return highSalary;
    }

    public void setHighSalary(Integer highSalary) {
        this.highSalary = highSalary;
    }

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public Integer getStockShareOption() {
        return stockShareOption;
    }

    public void setStockShareOption(Integer stockShareOption) {
        this.stockShareOption = stockShareOption;
    }
}
