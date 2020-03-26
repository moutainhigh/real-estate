package com.ztuo.modules.house.service;

import com.ztuo.modules.house.entity.UygurHouseResource;
import com.ztuo.modules.house.entity.UygurHouseResourceExample;
import com.ztuo.modules.house.vo.HouseCountVO;
import com.ztuo.modules.house.vo.HouseLocationVO;

import java.util.List;

/**
 * @author dpy
 */
public interface IUygurHouseResourceSV {
    
    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int countByExample(UygurHouseResourceExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int deleteByExample(UygurHouseResourceExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int deleteByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int save(UygurHouseResource record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int saveSelective(UygurHouseResource record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    List<UygurHouseResource> getByExample(UygurHouseResourceExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    UygurHouseResource getByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int updateByExampleSelective(UygurHouseResource record, UygurHouseResourceExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int updateByExample(UygurHouseResource record, UygurHouseResourceExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int updateByPrimaryKeySelective(UygurHouseResource record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table uygur_house_resource
     *
     * @date 2020-02-11 10:05:12
     */
    int updateByPrimaryKey(UygurHouseResource record) throws Exception;

    UygurHouseResource findBySignLabel(String signLabel);

    List<HouseLocationVO> getMapLocation(HouseCountVO houseCountVO);
}