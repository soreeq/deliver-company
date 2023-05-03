package org.example.delivery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner run(UserRepository userRepository) throws Exception {
//        return (String[] args) -> {
//            User user1 = new User("John", "john@domain.com");
//            User user2 = new User("Julie", "julie@domain.com");
//            userRepository.save(user1);
//            userRepository.save(user2);
//            userRepository.findAll().forEach(user -> System.out.println(user));
//        };
//    }
}