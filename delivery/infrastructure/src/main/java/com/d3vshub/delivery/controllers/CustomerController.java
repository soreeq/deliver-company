/*
package com.d3vshub.delivery.controllers;

import com.d3vshub.delivery.model.Customer;
import com.d3vshub.delivery.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
        Customer customer = findCustomerById(id);
        if (customer != null) {
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") int id, @RequestBody Customer updatedCustomer) {
        Customer customer = findCustomerById(id);
        if (customer != null) {
            customer.setFirst_name(updatedCustomer.getFirst_name());
            customer.setLast_name(updatedCustomer.getLast_name());
            customer.setEmail(updatedCustomer.getEmail());
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("id") int id) {
        Customer customer = findCustomerById(id);
        if (customer != null) {
            customers.remove(customer);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{customerId}/orders")
    public ResponseEntity<List<Order>> getOrderHistory(@PathVariable("customerId") int customerId) {
        // Implement your logic to retrieve order history for the customer
        List<Order> orderHistory = new ArrayList<>();
        return new ResponseEntity<>(orderHistory, HttpStatus.OK);
    }

    // Helper method to find a customer by ID
    private Customer findCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
*/
