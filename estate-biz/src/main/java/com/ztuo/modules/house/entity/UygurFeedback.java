package com.ztuo.modules.house.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UygurFeedback {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uygur_feedback.id
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uygur_feedback.create_time
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uygur_feedback.feedback
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    private String feedback;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uygur_feedback.contract
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    private String contract;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uygur_feedback.img_url
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    private String imgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uygur_feedback.remark
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uygur_feedback.user_id
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uygur_feedback.id
     *
     * @return the value of uygur_feedback.id
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uygur_feedback.id
     *
     * @param id the value for uygur_feedback.id
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uygur_feedback.create_time
     *
     * @return the value of uygur_feedback.create_time
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uygur_feedback.create_time
     *
     * @param createTime the value for uygur_feedback.create_time
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uygur_feedback.feedback
     *
     * @return the value of uygur_feedback.feedback
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uygur_feedback.feedback
     *
     * @param feedback the value for uygur_feedback.feedback
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uygur_feedback.contract
     *
     * @return the value of uygur_feedback.contract
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public String getContract() {
        return contract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uygur_feedback.contract
     *
     * @param contract the value for uygur_feedback.contract
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uygur_feedback.img_url
     *
     * @return the value of uygur_feedback.img_url
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uygur_feedback.img_url
     *
     * @param imgUrl the value for uygur_feedback.img_url
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uygur_feedback.remark
     *
     * @return the value of uygur_feedback.remark
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uygur_feedback.remark
     *
     * @param remark the value for uygur_feedback.remark
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column uygur_feedback.user_id
     *
     * @return the value of uygur_feedback.user_id
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column uygur_feedback.user_id
     *
     * @param userId the value for uygur_feedback.user_id
     *
     * @mbggenerated Mon Feb 10 17:12:42 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}