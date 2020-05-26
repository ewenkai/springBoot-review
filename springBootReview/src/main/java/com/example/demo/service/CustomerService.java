package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;


public interface CustomerService {
    /**
     * 条件查询
     * @param   customer 查询条件
     * @return  查询结果
     */
    List<Customer> findSomeCustomer(Customer customer);

    /**
     * 修改
     * @param customer  需要修改的数据
     * @return  修改反馈
     */
    int updateCustomer(Customer customer);

    /**
     * 添加
     * @param customers
     * @return
     */
    int addCustomer(List<Customer> customers);

    /**
     * 条件删除
     * @param customer 删除条件
     * @return
     */
    int deleteCustomer(List<Integer> customer);

}
