package com.unam.greenwave.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unam.greenwave.services.HomeService;


@RestController
@RequestMapping("/home") //ver como quieren que se maneje el path
public class HomeController {
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }


    @GetMapping()
    public String home() {
        return "home";
    }
    

}
