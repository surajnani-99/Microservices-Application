package com.azure.demo.homeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HomeServiceApplication {

    @GetMapping("/")
    public String home() {
        return "home-service is running!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeServiceApplication.class, args);
    }
}
