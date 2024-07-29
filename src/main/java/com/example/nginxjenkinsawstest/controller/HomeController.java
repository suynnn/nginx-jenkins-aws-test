package com.example.nginxjenkinsawstest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/check")
    public String heathCheck() {
        return "check";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
