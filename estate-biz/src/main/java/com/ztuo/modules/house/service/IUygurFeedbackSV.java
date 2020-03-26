package com.ztuo.modules.house.service;

import com.ztuo.modules.house.entity.UygurFeedback;
import com.ztuo.modules.house.entity.UygurFeedbackExample;

import java.util.List;

public interface IUygurFeedbackSV {
    
    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int countByExample(UygurFeedbackExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int deleteByExample(UygurFeedbackExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int deleteByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int save(UygurFeedback record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int saveSelective(UygurFeedback record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    List<UygurFeedback> getByExample(UygurFeedbackExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    UygurFeedback getByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int updateByExampleSelective(UygurFeedback record, UygurFeedbackExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int updateByExample(UygurFeedback record, UygurFeedbackExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int updateByPrimaryKeySelective(UygurFeedback record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_feedback
     *
     * @date 2020-02-10 16:50:53
     */
    int updateByPrimaryKey(UygurFeedback record) throws Exception;
}