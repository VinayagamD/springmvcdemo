package com.vinay.springmvcdemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("silly")
public class SillyController {
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }
}
