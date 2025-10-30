package com.azure.demo.homeservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Product> products = Arrays.asList(
                new Product("Apple", "/images/apple.png", 10),
                new Product("Milk", "/images/milk.png", 5),
                new Product("Bread", "/images/bread.png", 3)
        );
        model.addAttribute("products", products);
        return "home";
    }

    public static class Product {
        private String name;
        private String image;
        private int price;

        public Product(String name, String image, int price) {
            this.name = name;
            this.image = image;
            this.price = price;
        }

        public String getName() { return name; }
        public String getImage() { return image; }
        public int getPrice() { return price; }
    }
}

