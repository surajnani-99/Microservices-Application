package com.azure.demo.cartservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String cartPage(Model model) {
        // Dummy items to simulate a cart
        List<Map<String, Object>> items = new ArrayList<>();

        items.add(Map.of("name", "Fresh Apples (1kg)", "price", 120));
        items.add(Map.of("name", "Organic Milk (1L)", "price", 70));
        items.add(Map.of("name", "Brown Bread", "price", 45));

        double total = items.stream().mapToDouble(i -> (double) (int) i.get("price")).sum();

        model.addAttribute("items", items);
        model.addAttribute("total", total);

        return "cart";
    }
}

