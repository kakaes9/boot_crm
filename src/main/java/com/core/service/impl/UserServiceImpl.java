package com.core.service.impl;

import com.core.dao.UserDao;
import com.core.po.User;
import com.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * �û�service�ӿ�ʵ����
 * @author yjt
 * @create 2022-04-24-13:39
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    //ע��UserDao
    @Autowired
    private UserDao userDao;
    //ͨ���˺ź������ѯ�û�
    @Override
    public User findUser(String usercode, String password) {
        User user=this.userDao.findUser(usercode,password);
        return user;
    }
}
