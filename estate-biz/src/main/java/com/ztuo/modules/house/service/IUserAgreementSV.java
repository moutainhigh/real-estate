package com.ztuo.modules.house.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztuo.modules.house.entity.UserAgreement;
import com.ztuo.modules.house.entity.UserAgreementExample;
import com.ztuo.modules.house.vo.UserAgreementVo;

import java.util.List;

public interface IUserAgreementSV {
    
    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int countByExample(UserAgreementExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int deleteByExample(UserAgreementExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int deleteByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int save(UserAgreement record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int saveSelective(UserAgreement record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    List<UserAgreement> getByExample(UserAgreementExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    UserAgreement getByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int updateByExampleSelective(UserAgreement record, UserAgreementExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int updateByExample(UserAgreement record, UserAgreementExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int updateByPrimaryKeySelective(UserAgreement record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table user_agreement
     *
     * @date 2020-03-12 17:28:49
     */
    int updateByPrimaryKey(UserAgreement record) throws Exception;

    Page<UserAgreement> pageQuery(UserAgreementVo agreementVo) throws Exception;

    int abandonHistoryAgreement(String agreementType);

    UserAgreement findShelvesAgreement(String type);
}
