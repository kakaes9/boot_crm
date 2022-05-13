package com.core.service;

import com.core.po.Customer;
import com.util.Page;

/**
 * @author yjt
 * @create 2022-04-26-12:20
 */
public interface CustomerService {
    // 查询客户列表
    public Page<Customer> findCustomerList(Integer page, Integer rows, String custName,String custSource, String custIndustry,String custLevel);

    //新建客户
    public int createCustomer(Customer customer);

    //根据id查询客户
    public Customer getCustomerById(Integer id);

    //更新客户信息
    public int updateCustomer(Customer customer);

    //删除客户
    public int deleteCustomer(Integer id);
}
