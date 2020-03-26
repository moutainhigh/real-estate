package com.ztuo.modules.house.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztuo.common.utils.StringUtils;
import com.ztuo.modules.house.dao.EstateBrokerDAO;
import com.ztuo.modules.house.entity.EstateBroker;
import com.ztuo.modules.house.entity.EstateBrokerExample;
import com.ztuo.modules.house.service.IEstateBrokerSV;
import com.ztuo.modules.house.vo.BrokerQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateBrokerSVImpl implements IEstateBrokerSV {
    
    @Autowired
    private EstateBrokerDAO dao;
    
    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int countByExample(EstateBrokerExample example) throws Exception {
    		return dao.countByExample(example);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int deleteByExample(EstateBrokerExample example) throws Exception {
    		return dao.deleteByExample(example);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int deleteByPrimaryKey(Long parameterId) throws Exception {
    		return dao.deleteByPrimaryKey(parameterId);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int save(EstateBroker record) throws Exception {
    		return dao.save(record);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int saveSelective(EstateBroker record) throws Exception {
    		return dao.saveSelective(record);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public List<EstateBroker> getByExample(EstateBrokerExample example) throws Exception {
    		return dao.getByExample(example);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public EstateBroker getByPrimaryKey(Long parameterId) throws Exception {
    		return dao.getByPrimaryKey(parameterId);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int updateByExampleSelective(EstateBroker record, EstateBrokerExample example) throws Exception {
    		return dao.updateByExampleSelective(record, example);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int updateByExample(EstateBroker record, EstateBrokerExample example) throws Exception {
    		return dao.updateByExample(record, example);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int updateByPrimaryKeySelective(EstateBroker record) throws Exception {
    		return dao.updateByPrimaryKeySelective(record);
    }

    /**
     * This method was generated by IDE Plugin.
     * This method corresponds to the database table estate_broker
     *
     * @date 2020-02-11 10:05:12
     */
    public int updateByPrimaryKey(EstateBroker record) throws Exception {
    		return dao.updateByPrimaryKey(record);
    }

    @Override
    public Page<EstateBroker> pageQueryByCondition(BrokerQuery brokerQuery) {
        Page page = new Page(brokerQuery.getPageNum(), brokerQuery.getPageSize());
        EstateBrokerExample example = new EstateBrokerExample();
        EstateBrokerExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(brokerQuery.getAreaCode())) {
            criteria.andAreaCodeEqualTo(brokerQuery.getAreaCode());
        }
        criteria.andAuditStatusEqualTo(1);
        example.setOrderByClause("create_time desc");
        List<EstateBroker> brokerList = dao.pageQueryByExample(page, example,null);
        return page.setRecords(brokerList);
    }


}