package com.ihab.interview.customerservice.controller;

import com.ihab.interview.customerservice.data.Customer;
import com.ihab.interview.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAllCustomers();
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }
}
