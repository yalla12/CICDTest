package com.example.cicd_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "test2");
        return "hello";
    }
}
