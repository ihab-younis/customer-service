package com.ihab.interview.customerservice;

import com.ihab.interview.customerservice.data.Customer;

import java.util.UUID;

public class BaseTest {

    protected Customer initCustomer(){
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setFirstName("John");
        customer.setLastName("Smith");
        customer.setEmail("john.smith@gmail.com");
        customer.setPhone("111111111");
        return customer;
    }
}
