package com.d3vshub.delivery;

import com.d3vshub.delivery.model.*;
import com.d3vshub.delivery.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

@Component
public class SampleDataLoader implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CourierRepository courierRepository;

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private TrackingRepository trackingRepository;


    @Override
    public void run(String... args) throws Exception {
        loadSampleData();
    }

    private void loadSampleData() {
        // Wprowadzenie przykładowych danych do tabeli Customers
        Customer customer1 = new Customer(1, "John", "Doe", "john.doe@example.com");
        Customer customer2 = new Customer(2, "Jane", "Smith", "jane.smith@example.com");
        customerRepository.save(customer1);
        customerRepository.save(customer2);

        // Wprowadzenie przykładowych danych do tabeli Couriers
        Courier courier1 = new Courier(1, "Courier A", "123456789");
        Courier courier2 = new Courier(2, "Courier B", "987654321");
        courierRepository.save(courier1);
        courierRepository.save(courier2);

        // Wprowadzenie przykładowych danych do tabeli Delivery
        Delivery delivery1 = new Delivery(1, "123 Main St", "City A", "12345");
        Delivery delivery2 = new Delivery(2, "456 Elm St", "City B", "54321");
        deliveryRepository.save(delivery1);
        deliveryRepository.save(delivery2);

        // Wprowadzenie przykładowych danych do tabeli Orders
        String dateString = "2023-05-19";

        Order order1 = new Order(1,customer1, Date.valueOf(dateString), new BigDecimal("100.00"), "Pending", courier1, delivery1);
        Order order2 = new Order(2, customer2, Date.valueOf(dateString), new BigDecimal("200.00"), "Shipped", courier2, delivery2);
        orderRepository.save(order1);
        orderRepository.save(order2);

        // Wprowadzenie przykładowych danych do tabeli Tracking
        Tracking tracking1 = new Tracking(1, order1, Date.valueOf(dateString), "In Transit");
        Tracking tracking2 = new Tracking(2, order2, Date.valueOf(dateString), "Delivered");
        trackingRepository.save(tracking1);
        trackingRepository.save(tracking2);

        System.out.println(courierRepository.findById(1));
    }
}
