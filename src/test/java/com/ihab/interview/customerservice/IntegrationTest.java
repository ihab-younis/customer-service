package com.ihab.interview.customerservice;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest extends BaseTest{
    static final String CUSTOMER_BASE_URI = "/customer/v1";

    protected static final String FIND_ALL_CUSTOMERS_URI = CUSTOMER_BASE_URI+"/all";

    protected static final String FIND_CUSTOMER_BY_ID_URI = CUSTOMER_BASE_URI;

    protected static final String UPDATE_CUSTOMER_URI = CUSTOMER_BASE_URI;

    protected static final String DELETE_CUSTOMER_URI = CUSTOMER_BASE_URI;
}
