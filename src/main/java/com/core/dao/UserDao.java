package com.core.dao;

import com.core.po.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户dao层接口
 * @author yjt
 * @create 2022-04-24-13:10
 */
public interface UserDao {
    /**
     * 通过账号和密码查询用户
     */
    public User findUser(@Param("usercode") String username, @Param("password") String password);

}
