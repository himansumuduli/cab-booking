package com.example.GetRide.transformer;

import com.example.GetRide.dto.request.CustomerRequest;
import com.example.GetRide.dto.response.CustomerResponse;
import com.example.GetRide.model.Customer;

public class CustomerTransformer {
    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){
       return Customer.builder()
               .name(customerRequest.getName())
               .age(customerRequest.getAge())
               .emailId(customerRequest.getEmailId())
               .gender(customerRequest.getGender())
               .build();

    }
    public static CustomerResponse customerToCustomerResponse(Customer customer){
//        CustomerResponse customerResponse = new CustomerResponse();
//        customerResponse.setName(customer.getName());
//        customerResponse.setGender(customer.getGender());
//        customerResponse.setEmailId(customer.getEmailId());
//        return customerResponse;
        return CustomerResponse.builder()
                .name(customer.getName())
                .gender(customer.getGender())
                .emailId(customer.getEmailId())
                .build();
    }
}
