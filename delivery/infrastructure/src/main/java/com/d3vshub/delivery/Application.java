package com.d3vshub.delivery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        TemporalValues temporalValues = new TemporalValues();
        temporalValues.setSqlDate(java.sql.Date.valueOf("2017-11-15"));
        temporalValues.setSqlTime(java.sql.Time.valueOf("15:30:14"));
        temporalValues.setSqlTimestamp(
                java.sql.Timestamp.valueOf("2017-11-15 15:30:14.332"));
    }
}