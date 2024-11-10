package com.ihab.interview.customerservice.repository;

import com.ihab.interview.customerservice.data.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
