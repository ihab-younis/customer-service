package com.ihab.interview.customerservice.controller;

import com.ihab.interview.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/test")
    public String test() {
        return customerService.test();
    }
}
