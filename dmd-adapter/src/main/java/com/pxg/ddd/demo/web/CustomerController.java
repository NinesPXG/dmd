package com.pxg.ddd.demo.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.pxg.ddd.demo.api.CustomerServiceI;
import com.pxg.ddd.demo.dto.command.CustomerAddCmd;
import com.pxg.ddd.demo.dto.command.query.CustomerListByNameQry;
import com.pxg.ddd.demo.dto.data.CustomerDTO;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "customer")
@Api(tags = "用户管理")
public class CustomerController {

    @Autowired
    private CustomerServiceI customerService;

    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to COLA world!";
    }

    @GetMapping(value = "/list")
    @Operation(summary = "列表查询")
    public MultiResponse<CustomerDTO> listCustomerByName(@RequestParam(required = false) String name){
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setName(name);
        return customerService.listByName(customerListByNameQry);
    }

    @PostMapping(value = "/insert")
    @Operation(summary = "添加")
    public Response addCustomer(@RequestBody @Validated CustomerAddCmd customerAddCmd){
        return customerService.addCustomer(customerAddCmd);
    }
}
