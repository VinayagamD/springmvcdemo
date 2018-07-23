package com.vinay.springmvcdemo.controllers;

import com.vinay.springmvcdemo.models.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("customer")
public class CustomerController {

    /*
    * Add an initbinder........... to covert trim string output inout strings
    * remove lwading and trailing white space
    * resolve issue for our validation
    *
    * */

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @GetMapping("/showForm")
    public String showForm(Model theModel){
        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @PostMapping("processForm")
    public String  processForm(@Valid @ModelAttribute("customer") Customer  customer, BindingResult theBindingResult){
        System.out.println("Last Name: | "+customer.getLastName()+"|");
        if(theBindingResult.hasErrors()){
            return "customer-form";
        }else {
        return "customer-confirmation";
        }
    }
}
