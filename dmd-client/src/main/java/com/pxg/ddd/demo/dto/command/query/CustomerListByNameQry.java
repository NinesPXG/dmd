package com.pxg.ddd.demo.dto.command.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

@Data
public class CustomerListByNameQry extends Query{
   private String name;
}
