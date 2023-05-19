//package com.d3vshub.delivery;
//
//import com.d3vshub.delivery.model.Courier;
//import com.d3vshub.delivery.repository.CourierRepository;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class CourierServiceTest {
//
//    @Autowired
//    private CourierRepository courierRepository;
//
//    @Test
//    public void courierGetFromDbTest() {
//        int courierId = 1; // Przykładowy identyfikator kuriera
//
//        Courier courier = courierRepository.findById(courierId);
//        if (courier != null) {
//            int id = courier.getId();
//            // Wywołanie id kuriera
//            System.out.println("Id kuriera: " + id);
//        } else {
//            System.out.println("Kurier o podanym id nie został znaleziony");
//        }
//    }
//
//}
