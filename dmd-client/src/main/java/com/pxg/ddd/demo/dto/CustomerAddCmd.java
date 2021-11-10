package com.pxg.ddd.demo.dto;

import com.pxg.ddd.demo.dto.data.CustomerDTO;
import lombok.Data;

@Data
public class CustomerAddCmd{

    private CustomerDTO customerDTO;

}
