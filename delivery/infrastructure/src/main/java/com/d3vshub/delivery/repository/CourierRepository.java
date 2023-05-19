package com.d3vshub.delivery.repository;

import com.d3vshub.delivery.model.Courier;
import com.d3vshub.delivery.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourierRepository extends JpaRepository<Courier, Long> {
    Courier findById(int courier_id);
    List<Courier> findAll();
}