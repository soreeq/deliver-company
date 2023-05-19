package com.d3vshub.delivery;

import com.d3vshub.delivery.model.Courier;
import com.d3vshub.delivery.model.Customer;
import com.d3vshub.delivery.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void customerGetFromDbTest() {
        int customerId = 1; // Przykładowy identyfikator kuriera

        Customer customer = customerRepository.findById(customerId);
        if (customer != null) {
            int id = customer.getId();
            // Wywołanie id klienta
            System.out.println("Id klienta: " + id);
        } else {
            System.out.println("Klient o podanym id nie został znaleziony");
        }
    }

}
