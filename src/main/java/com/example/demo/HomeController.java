package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin("*")
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index.html";
    }
}