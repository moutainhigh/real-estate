package com.ztuo.modules.house.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztuo.modules.house.entity.Advertising;
import com.ztuo.modules.house.entity.AdvertisingExample;
import com.ztuo.modules.house.vo.AdvertisingQueryVO;

import java.util.List;

public interface IAdvertisingSV {
    
    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int countByExample(AdvertisingExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int deleteByExample(AdvertisingExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int deleteByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int save(Advertising record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int saveSelective(Advertising record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    List<Advertising> getByExample(AdvertisingExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    Advertising getByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int updateByExampleSelective(Advertising record, AdvertisingExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int updateByExample(Advertising record, AdvertisingExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int updateByPrimaryKeySelective(Advertising record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table advertising
     *
     * @date 2020-03-03 18:41:23
     */
    int updateByPrimaryKey(Advertising record) throws Exception;

    Page<Advertising> pageQuery(AdvertisingQueryVO queryVO) throws Exception;
}