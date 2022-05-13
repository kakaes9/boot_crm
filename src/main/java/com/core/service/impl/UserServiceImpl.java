package com.core.service.impl;

import com.core.dao.UserDao;
import com.core.po.User;
import com.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户service接口实现类
 * @author yjt
 * @create 2022-04-24-13:39
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    //注入UserDao
    @Autowired
    private UserDao userDao;
    //通过账号和密码查询用户
    @Override
    public User findUser(String usercode, String password) {
        User user=this.userDao.findUser(usercode,password);
        return user;
    }
}
