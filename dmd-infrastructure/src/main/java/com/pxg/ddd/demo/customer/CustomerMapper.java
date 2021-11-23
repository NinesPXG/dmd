package com.pxg.ddd.demo.customer;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper{

  public CustomerDao getById(String customerId);
}
