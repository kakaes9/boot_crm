package com.core.dao;

import com.core.po.BaseDict;

import java.util.List;

/**
 * 数据字典
 * @author yjt
 * @create 2022-04-25-16:37
 */
public interface BaseDictDao {
    // 根据类别代码查询数据字典
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}

