package com.Suraj_Kadam.DSAVisualizer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/bubble-sort")
    public String bubbleSort() {
        return "bubble-sort";
    }
}
