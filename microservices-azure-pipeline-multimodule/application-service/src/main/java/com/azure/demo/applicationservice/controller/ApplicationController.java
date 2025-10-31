package com.azure.demo.applicationservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    // Payment page (after user goes from CartService)
    @GetMapping("/payment")
    public String paymentPage(Model model) {
        // You can add attributes to the model if needed
        model.addAttribute("totalAmount", 45); // Example amount
        return "payment"; // Returns payment.html from templates
    }

    // Confirmation page (after payment success)
    @GetMapping("/confirmation")
    public String confirmationPage(Model model) {
        // Example order ID
        model.addAttribute("orderId", "QC12345");
        return "confirmation"; // Returns confirmation.html from templates
    }

    // Optional: Root redirect to payment if someone hits "/"
   
}

