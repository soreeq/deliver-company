package com.d3vshub.delivery.services;

import com.d3vshub.delivery.model.Customer;
import com.d3vshub.delivery.model.Delivery;
import com.d3vshub.delivery.repository.CustomerRepository;
import com.d3vshub.delivery.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public List<Delivery> getAllDelivery() {
        return deliveryRepository.findAll();
    }
}
