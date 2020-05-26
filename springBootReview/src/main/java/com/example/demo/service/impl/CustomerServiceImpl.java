package com.example.demo.service.impl;

import com.example.demo.dao.CustomerMapper;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerExample;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<Customer> findSomeCustomer(Customer customer) {
        return customerMapper.findSomeCustomer(customer);
    }

    @Override
    public int updateCustomer(Customer customer) {
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andIdEqualTo(customer.getId());
        return customerMapper.updateByExampleSelective(customer,customerExample);
    }

    @Override
    public int addCustomer(List<Customer> customers) {
        int count=0;
        for (Customer customer : customers) {
            int insert = customerMapper.insert(customer);
            count+=insert;
        }
        return count;
    }

    @Override
    public int deleteCustomer(List<Integer> customer) {
        int count=0;
        for (Integer integer : customer) {
            int i = customerMapper.deleteByPrimaryKey(integer);
            count+=i;
        }
        return count;
    }
}
