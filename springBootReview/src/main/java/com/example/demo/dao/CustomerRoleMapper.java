package com.example.demo.dao;

import com.example.demo.model.CustomerRoleExample;
import com.example.demo.model.CustomerRoleKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerRoleMapper {
    long countByExample(CustomerRoleExample example);

    int deleteByExample(CustomerRoleExample example);

    int deleteByPrimaryKey(CustomerRoleKey key);

    int insert(CustomerRoleKey record);

    int insertSelective(CustomerRoleKey record);

    List<CustomerRoleKey> selectByExample(CustomerRoleExample example);

    int updateByExampleSelective(@Param("record") CustomerRoleKey record, @Param("example") CustomerRoleExample example);

    int updateByExample(@Param("record") CustomerRoleKey record, @Param("example") CustomerRoleExample example);
}