package com.core.service.impl;

import com.core.dao.BaseDictDao;
import com.core.po.BaseDict;
import com.core.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * 数据字典Service接口实现类
 */
@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService{
    @Autowired
    private BaseDictDao baseDictDao;
    //根据类别代码查询数据字典
    public List<BaseDict> findBaseDictByTypeCode(String typecode) {
        return baseDictDao.selectBaseDictByTypeCode(typecode);
    }
}