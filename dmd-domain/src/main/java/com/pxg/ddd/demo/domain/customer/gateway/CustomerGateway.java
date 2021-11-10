package com.pxg.ddd.demo.domain.customer.gateway;

import com.pxg.ddd.demo.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
