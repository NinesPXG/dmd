package com.pxg.ddd.demo.dto.command;

import com.pxg.ddd.demo.dto.data.CustomerDTO;
import lombok.Data;

@Data
public class CustomerAddCmd{

    private CustomerDTO customerDTO;

}
