package com.d3vshub.delivery;

import com.d3vshub.delivery.model.Courier;
import com.d3vshub.delivery.repository.CourierRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourierServiceTest {

    @Autowired
    private CourierRepository courierRepository;

    @Test
    public void courierGetFromDbTest() {
        int courierId = 1; // Przykładowy identyfikator kuriera

        Courier courier = courierRepository.findById(courierId);
        if (courier != null) {
            int id = courier.getId();
            // Wywołanie id kuriera
            System.out.println("Id kuriera: " + id);
        } else {
            System.out.println("Kurier o podanym id nie został znaleziony");
        }
    }

}
