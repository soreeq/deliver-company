package com.d3vshub.delivery.repository;

import com.d3vshub.delivery.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findById(int id);
    List<Order> findAll();
}
