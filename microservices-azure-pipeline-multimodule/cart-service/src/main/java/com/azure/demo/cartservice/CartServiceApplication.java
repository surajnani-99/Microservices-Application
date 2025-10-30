package com.azure.demo.cartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class CartServiceApplication {

    @GetMapping("/")
    public String home() {
        return "cart-service is running!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CartServiceApplication.class, args);
    }
}
