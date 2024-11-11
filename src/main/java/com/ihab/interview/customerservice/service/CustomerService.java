package com.ihab.interview.customerservice.service;

import com.ihab.interview.customerservice.data.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<Customer> findAllCustomers();

    Customer findByID(UUID id);

    void updateCustomer(Customer customer);

    void deleteCustomer(UUID id);
}



