package com.ihab.interview.customerservice.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public String test() {
        return "test";
    }
}
