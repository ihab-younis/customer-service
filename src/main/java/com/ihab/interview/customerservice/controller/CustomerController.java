package com.ihab.interview.customerservice.controller;

import com.ihab.interview.customerservice.data.Customer;
import com.ihab.interview.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/customer/v1")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public List<Customer> findAll() {
        return customerService.findAllCustomers();
    }

    @GetMapping
    public Customer findById(@RequestParam UUID id) {
        return customerService.findByID(id);
    }

    /**
     * Used for adding and updating customer row on DB
     * @param customer customer entity
     */
    @PutMapping
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@RequestParam UUID id) {
        customerService.deleteCustomer(id);
    }
}
