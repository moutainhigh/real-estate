/*
 * 项目名称:my-museum
 * 类名称:SysOrgService.java
 * 包名称:com.platform.modules.sys.service
 *
 * 修改履历:
 *     日期                       修正者        主要内容
 *     2019-01-21 11:29:22        gs     初版做成
 *
 * Copyright (c) 2018-2019
 */
package com.ztuo.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ztuo.modules.house.dto.SysOrgDTO;
import com.ztuo.modules.sys.entity.SysOrgEntity;
import com.ztuo.modules.sys.entity.SysOrgVO;

import java.util.List;
import java.util.Map;

/**
 * 组织机构Service接口
 *
 * @author gs
 * @date 2019-01-21 11:29:22
 */
public interface SysOrgService extends IService<SysOrgEntity> {

    /**
     * 查询所有列表
     *
     * @param params 查询参数
     * @return List
     */
    List<SysOrgEntity> queryAll(Map<String, Object> params);

    /**
     * 新增实体
     *
     * @param sysOrg 实体
     */
    void add(SysOrgEntity sysOrg);

    /**
     * 根据主键更新实体
     *
     * @param sysOrg 实体
     */
    void update(SysOrgEntity sysOrg);

    /**
     * 根据主键删除
     *
     * @param orgNo 机构编码
     */
    void delete(String orgNo);

    /**
     * 根据主键批量删除
     *
     * @param orgNos 机构编码集
     */
    void deleteBatch(String[] orgNos);

    /**
     * 根据OrgNo查询子机构
     *
     * @param orgNo 机构编码
     * @return List
     */
    List<SysOrgEntity> queryListByOrgNo(String orgNo);

    List<SysOrgVO> getArea(String parentCode,Integer level);

    List<SysOrgVO> getAreaWy(String parentCode, Integer level);

    SysOrgEntity getByOrgNo(String orgNo);

    List<SysOrgDTO> getAreaAll(String parentCode, Integer level);
}
