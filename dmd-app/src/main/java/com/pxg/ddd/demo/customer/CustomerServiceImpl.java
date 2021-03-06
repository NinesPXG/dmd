package com.pxg.ddd.demo.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.pxg.ddd.demo.api.CustomerServiceI;
import com.pxg.ddd.demo.dto.command.CustomerAddCmd;
import com.pxg.ddd.demo.dto.command.query.CustomerListByNameQry;
import com.pxg.ddd.demo.dto.data.CustomerDTO;
import org.springframework.stereotype.Service;

import com.pxg.ddd.demo.customer.executor.CustomerAddCmdExe;
import com.pxg.ddd.demo.customer.executor.query.CustomerListByNameQryExe;

import javax.annotation.Resource;


@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}