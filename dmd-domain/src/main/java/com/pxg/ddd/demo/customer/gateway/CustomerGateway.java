package com.pxg.ddd.demo.customer.gateway;

import com.pxg.ddd.demo.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
