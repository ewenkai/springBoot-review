package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/findSomeCustomer",method = RequestMethod.GET)
    public List<Customer> findSomeCustomer(Customer customer){
        return customerService.findSomeCustomer(customer);
    }
}
