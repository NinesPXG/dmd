package com.pxg.ddd.demo.dto.command;

import com.pxg.ddd.demo.dto.data.CustomerDTO;
import lombok.Data;

import javax.validation.Valid;

@Data
public class CustomerAddCmd{

    @Valid
    private CustomerDTO customerDTO;

}
