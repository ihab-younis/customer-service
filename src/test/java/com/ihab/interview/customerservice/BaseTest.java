package com.ihab.interview.customerservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.ihab.interview.customerservice.data.Customer;

import java.util.UUID;

public class BaseTest {
    private final ObjectWriter Objectwriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
    /**
     * could be stored as json file instead later
     * @return Customer entity
     */
    protected Customer initCustomer(){
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setFirstName("John");
        customer.setLastName("Smith");
        customer.setEmail("john.smith@gmail.com");
        customer.setPhone("111111111");
        return customer;
    }

    protected String getJson(Object object){
        try {
            return Objectwriter.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
