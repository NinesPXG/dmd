package com.pxg.ddd.demo.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.pxg.ddd.demo.dto.command.CustomerAddCmd;
import com.pxg.ddd.demo.dto.command.query.CustomerListByNameQry;
import com.pxg.ddd.demo.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
