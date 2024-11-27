package com.unam.greenwave.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unam.greenwave.services.HomeService;


@Controller
@RequestMapping("/home")
public class HomeController {
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }


    @GetMapping()
    public String home() {
        return "home";
    }

    //Vista del vendedor/administrador
    @GetMapping("/vendedor")
    public String vendedor() {
        return "vendedor";
    }
    

}
