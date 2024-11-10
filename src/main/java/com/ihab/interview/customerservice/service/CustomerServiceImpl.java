package com.ihab.interview.customerservice.service;

import com.ihab.interview.customerservice.data.Customer;
import com.ihab.interview.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);

        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
