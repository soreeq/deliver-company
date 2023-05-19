package com.d3vshub.delivery.repository;

import com.d3vshub.delivery.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findById(int id);
    List<Customer> findAll();
}
