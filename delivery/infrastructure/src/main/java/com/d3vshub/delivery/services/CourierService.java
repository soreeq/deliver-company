package com.d3vshub.delivery.services;

import com.d3vshub.delivery.model.Courier;
import com.d3vshub.delivery.model.Customer;
import com.d3vshub.delivery.repository.CourierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierService {
    private final CourierRepository courierRepository;

    public CourierService(CourierRepository courierRepository) {
        this.courierRepository = courierRepository;
    }

    public List<Courier> getAllCouriers() {
        return courierRepository.findAll();
    }
}
