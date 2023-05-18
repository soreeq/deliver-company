package com.d3vshub.delivery.repository;

import com.d3vshub.delivery.model.Courier;
import com.d3vshub.delivery.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourierRepository extends CrudRepository<Courier, Long> {
    List<Courier> findAll();
}