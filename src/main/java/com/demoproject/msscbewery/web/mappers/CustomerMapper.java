package com.demoproject.msscbewery.web.mappers;

import com.demoproject.msscbewery.domain.Customer;
import com.demoproject.msscbewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);

}
