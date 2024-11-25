package com.unam.greenwave.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginPage() {
        return "login/login"; // Apunta a src/main/resources/templates/login/login.html
    }
}
