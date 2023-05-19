package com.d3vshub.delivery.services;

import com.d3vshub.delivery.model.Courier;
import com.d3vshub.delivery.model.Order;
import com.d3vshub.delivery.repository.CourierRepository;
import com.d3vshub.delivery.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}
