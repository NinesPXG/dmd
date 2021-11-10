package com.pxg.ddd.demo.domain.customer.gateway;

import com.pxg.ddd.demo.domain.customer.Customer;
import com.pxg.ddd.demo.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
