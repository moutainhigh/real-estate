/*
 * 项目名称:my-museum
 * 类名称:SysLogService.java
 * 包名称:com.platform.modules.sys.service
 *
 * 修改履历:
 *      日期                修正者      主要内容
 *      2018/11/21 16:04    gs      初版完成
 *
 * Copyright (c) 2019-2019
 */
package com.ztuo.modules.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ztuo.modules.sys.entity.SysLogEntity;

import java.util.Map;

/**
 * 系统日志
 *
 * @author gs
 */
public interface SysLogService extends IService<SysLogEntity> {

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return IPage
     */
    IPage queryPage(Map<String, Object> params);
}
