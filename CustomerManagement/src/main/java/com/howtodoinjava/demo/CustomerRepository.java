package com.howtodoinjava.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.CustomerEntity;
 
@Repository
public interface CustomerRepository
        extends JpaRepository<CustomerEntity, Long> {
 
}