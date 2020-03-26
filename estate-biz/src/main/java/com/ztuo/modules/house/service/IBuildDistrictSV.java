package com.ztuo.modules.house.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztuo.modules.house.entity.BuildDistrict;
import com.ztuo.modules.house.entity.BuildDistrictExample;
import com.ztuo.modules.house.vo.BuildDistrictVO;

import java.util.List;
import java.util.Map;

public interface IBuildDistrictSV {
    
    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int countByExample(BuildDistrictExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int deleteByExample(BuildDistrictExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int deleteByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int save(BuildDistrict record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int saveSelective(BuildDistrict record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    List<BuildDistrict> getByExample(BuildDistrictExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    BuildDistrict getByPrimaryKey(Long parameterId) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int updateByExampleSelective(BuildDistrict record, BuildDistrictExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int updateByExample(BuildDistrict record, BuildDistrictExample example) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int updateByPrimaryKeySelective(BuildDistrict record) throws Exception;

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table build_district
     *
     * @date 2020-03-02 18:04:46
     */
    int updateByPrimaryKey(BuildDistrict record) throws Exception;

    Page<BuildDistrict> pageQuery(BuildDistrictVO districtVO, Map<String, Object> params);

    List<BuildDistrict> getBuildInfo(String parentNo) throws Exception;

    List<BuildDistrict> getBuildInfoWy(String parentNo) throws Exception;

}