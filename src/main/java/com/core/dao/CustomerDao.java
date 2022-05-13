package com.core.dao;

import com.core.po.Customer;

import java.util.List;

/**
 * Customer接口
 * @author yjt
 * @create 2022-04-25-16:17
 */
public interface CustomerDao {


    // 客户列表
    public List<Customer> selectCustomerList(Customer customer);
    // 客户数
    public Integer selectCustomerListCount(Customer customer);
    //c创建客户
    public int createCustomer(Customer customer);
    //根据id查询客户
    public Customer getCustomerById(Integer id);
    //更新客户
    public int updateCustomer(Customer customer);
    //删除客户
    public int deleteCustomer(Integer id);
}
