package com.pxg.ddd.demo.repository.customer;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper extends BaseMapper<CustomerDao> {

  CustomerDao getById(String customerId);

  CustomerDao findById(@Param("id") String customerId);

}
