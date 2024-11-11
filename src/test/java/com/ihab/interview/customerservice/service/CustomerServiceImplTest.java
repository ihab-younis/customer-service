package com.ihab.interview.customerservice.service;

import com.ihab.interview.customerservice.data.Customer;
import com.ihab.interview.customerservice.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.*;

@ExtendWith(SpringExtension.class)
public class CustomerServiceImplTest {
    @InjectMocks
    private CustomerServiceImpl customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void testFindAllCustomers() {
        List<Customer> repoCustomers = List.of(initCustomer());
        Mockito.when(customerRepository.findAll()).thenReturn(repoCustomers);

        List<Customer> customersResult = customerService.findAllCustomers();
        assert customersResult != null;
        assert customersResult.size() == 1;
    }

    private Customer initCustomer(){
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setFirstName("John");
        customer.setLastName("Smith");
        customer.setEmail("john.smith@gmail.com");
        customer.setPhone("111111111");
        return customer;
    }
}
