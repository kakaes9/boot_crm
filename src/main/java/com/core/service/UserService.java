package com.core.service;

import com.core.po.User;

/**
 * @author yjt
 * @create 2022-04-24-13:36
 */
public interface UserService {
    //ͨ���˺ź������ѯ�û�
    public User findUser(String usercode,String password);
}
