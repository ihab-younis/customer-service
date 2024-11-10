package com.ihab.interview.customerservice.service;

import com.ihab.interview.customerservice.data.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();
    void addCustomer(Customer customer);
}



