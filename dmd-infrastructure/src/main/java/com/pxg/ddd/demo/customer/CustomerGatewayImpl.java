package com.pxg.ddd.demo.customer;

import com.pxg.ddd.demo.customer.gateway.CustomerGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getByById(String customerId){
      CustomerDao dao = customerMapper.getById(customerId);
      //Convert to Customer
      return CustomerConvertor.INSTANCE.dao2Do(dao);
    }
}
