package com.d3vshub.delivery.repository;

import com.d3vshub.delivery.model.Courier;
import com.d3vshub.delivery.model.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
    List<Delivery> findAll();
}