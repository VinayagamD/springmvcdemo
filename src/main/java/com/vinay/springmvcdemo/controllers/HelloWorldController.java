package com.vinay.springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    // need  a controller  method to show initial form
    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //    need a controller method to process the HTML form
    @GetMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    //    new controller method to read form data and
//    add data to the model
    @GetMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
//        Convert the data into all uppercase
        theName = theName.toUpperCase();
//        Create our message
        String result = "Yo! "+theName;
//        Add message to the model
        model.addAttribute("message",result);
        return "helloworld";
    }

    //    new controller method to read form data using RequestParam and
//    add data to the model
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
//        Convert the data into all uppercase
        theName = theName.toUpperCase();
//        Create our message
        String result = "Hey My Friend from v3! "+theName;
//        Add message to the model
        model.addAttribute("message",result);
        return "helloworld";
    }




}
