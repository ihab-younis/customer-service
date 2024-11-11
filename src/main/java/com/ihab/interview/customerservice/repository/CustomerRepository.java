package com.ihab.interview.customerservice.repository;

import com.ihab.interview.customerservice.data.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Ihab Younis
 * CRUD repository which there is no implementation for, provides only the basic operations, gets implemented by Springframework
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
