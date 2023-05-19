package com.d3vshub.delivery;


import com.d3vshub.delivery.model.Courier;
import com.d3vshub.delivery.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


/*        Courier courier = new Courier();
        courier.setFirst_name("test");
        courier.setCourier_id(1);
        courier.setLast_name("test2");
        courier.setEmail("raz@dwa.pl");*/
    }
}