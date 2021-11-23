package com.pxg.ddd.demo.repository.customer;

import com.pxg.ddd.demo.customer.Customer;
import com.pxg.ddd.demo.dto.data.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerConvertor {

    CustomerConvertor INSTANCE = Mappers.getMapper(CustomerConvertor.class);

    CustomerDTO do2Dto(Customer customer);

    Customer dto2Do(CustomerDTO dto);

    CustomerDao do2Dao(Customer customer);

    Customer dao2Do(CustomerDao dao);
}
