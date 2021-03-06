package com.ztuo.modules.house.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserHouse {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.user_id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.user_name
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.mobile_phone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String mobilePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.housing_zone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String housingZone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.city_zone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String cityZone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.area_code
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String areaCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.address
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.floor_info
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String floorInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.area
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String area;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.decorate_type
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String decorateType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.attachment_info_id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String attachmentInfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.load_type
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String loadType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.status
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.sign_label
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private String signLabel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_house.create_time
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.id
     *
     * @return the value of user_house.id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.id
     *
     * @param id the value for user_house.id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.user_id
     *
     * @return the value of user_house.user_id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.user_id
     *
     * @param userId the value for user_house.user_id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.user_name
     *
     * @return the value of user_house.user_name
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.user_name
     *
     * @param userName the value for user_house.user_name
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.mobile_phone
     *
     * @return the value of user_house.mobile_phone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.mobile_phone
     *
     * @param mobilePhone the value for user_house.mobile_phone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.housing_zone
     *
     * @return the value of user_house.housing_zone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getHousingZone() {
        return housingZone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.housing_zone
     *
     * @param housingZone the value for user_house.housing_zone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setHousingZone(String housingZone) {
        this.housingZone = housingZone == null ? null : housingZone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.city_zone
     *
     * @return the value of user_house.city_zone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getCityZone() {
        return cityZone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.city_zone
     *
     * @param cityZone the value for user_house.city_zone
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setCityZone(String cityZone) {
        this.cityZone = cityZone == null ? null : cityZone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.area_code
     *
     * @return the value of user_house.area_code
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.area_code
     *
     * @param areaCode the value for user_house.area_code
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.address
     *
     * @return the value of user_house.address
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.address
     *
     * @param address the value for user_house.address
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.floor_info
     *
     * @return the value of user_house.floor_info
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getFloorInfo() {
        return floorInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.floor_info
     *
     * @param floorInfo the value for user_house.floor_info
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setFloorInfo(String floorInfo) {
        this.floorInfo = floorInfo == null ? null : floorInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.area
     *
     * @return the value of user_house.area
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.area
     *
     * @param area the value for user_house.area
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.decorate_type
     *
     * @return the value of user_house.decorate_type
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getDecorateType() {
        return decorateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.decorate_type
     *
     * @param decorateType the value for user_house.decorate_type
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setDecorateType(String decorateType) {
        this.decorateType = decorateType == null ? null : decorateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.attachment_info_id
     *
     * @return the value of user_house.attachment_info_id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getAttachmentInfoId() {
        return attachmentInfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.attachment_info_id
     *
     * @param attachmentInfoId the value for user_house.attachment_info_id
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setAttachmentInfoId(String attachmentInfoId) {
        this.attachmentInfoId = attachmentInfoId == null ? null : attachmentInfoId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.load_type
     *
     * @return the value of user_house.load_type
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.load_type
     *
     * @param loadType the value for user_house.load_type
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType == null ? null : loadType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.status
     *
     * @return the value of user_house.status
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.status
     *
     * @param status the value for user_house.status
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.sign_label
     *
     * @return the value of user_house.sign_label
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public String getSignLabel() {
        return signLabel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.sign_label
     *
     * @param signLabel the value for user_house.sign_label
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setSignLabel(String signLabel) {
        this.signLabel = signLabel == null ? null : signLabel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_house.create_time
     *
     * @return the value of user_house.create_time
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_house.create_time
     *
     * @param createTime the value for user_house.create_time
     *
     * @mbggenerated Sat Feb 15 16:13:37 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}