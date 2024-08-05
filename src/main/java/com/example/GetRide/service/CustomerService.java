package com.example.GetRide.service;

import com.example.GetRide.dto.request.CustomerRequest;
import com.example.GetRide.model.Customer;
import com.example.GetRide.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public String addcustomer(CustomerRequest customerRequest) {

        //dto-entity
        Customer customer= new Customer();
        customer.setAge(customer.getAge());
        customer.setName(customer.getName());
        customer.setGender(customer.getGender());
        customer.setEmailId(customer.getEmailId());
        Customer savedCustomer = customerRepository.save(customer);
        return " customer add successfully";
    }

    public Customer getCustomer(String email) {


    }
}
