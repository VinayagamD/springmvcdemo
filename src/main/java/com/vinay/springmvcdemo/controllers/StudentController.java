package com.vinay.springmvcdemo.controllers;

import com.vinay.springmvcdemo.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping("/showForm")
    public String showForm(Model model){
//        Create the student object
        Student student = new Student();
//        add the student  object to the model
        model.addAttribute("student",student);
        return "student-form";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

//        log the input data
        System.out.println(
                "theStudent: " +theStudent.getFirstName()
                +" "+theStudent.getLastName()
        );

        return "student-confirmation";
    }
}
