package com.core.service;

import com.core.po.BaseDict;
import java.util.List;

/**
 * 数据字典Service接口
 * @author yjt
 * @create 2022-04-26-12:13
 */
public interface BaseDictService {
    //根据类别代码查询数据字典
    public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
