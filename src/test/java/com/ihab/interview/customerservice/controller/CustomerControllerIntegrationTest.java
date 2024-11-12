package com.ihab.interview.customerservice.controller;

import com.ihab.interview.customerservice.IntegrationTest;
import com.ihab.interview.customerservice.data.Customer;
import com.ihab.interview.customerservice.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CustomerControllerIntegrationTest extends IntegrationTest {

    @Autowired
    private MockMvc client;

    @MockBean
    private CustomerRepository customerRepository;

    @Test
    public void testFindAllCustomers() throws Exception {
        client.perform(get(FIND_ALL_CUSTOMERS_URI))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    public void testFindCustomerById() throws Exception{
        Customer customer = initCustomer();
        UUID id = customer.getId();
        String customerJson = getJson(customer);
        Mockito.when(customerRepository.findById(id)).thenReturn(Optional.of(customer));

        client.perform(get(FIND_CUSTOMER_BY_ID_URI+"?id="+id))
                .andExpect(status().isOk())
                .andExpect(content().json(customerJson));
    }

    @Test
    public void testUpdateCustomer() throws Exception{
        String customerJson = getJson(initCustomer());

        client.perform(put(UPDATE_CUSTOMER_URI).contentType(MediaType.APPLICATION_JSON).content(customerJson))
                .andExpect(status().isOk());
    }

    @Test
    public void testDeleteCustomer() throws Exception{
        client.perform(delete(DELETE_CUSTOMER_URI+"?id="+UUID.randomUUID()))
                .andExpect(status().isOk());
    }
}
