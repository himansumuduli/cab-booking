package com.example.GetRide.repository;

import com.example.GetRide.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {



}
