package com.Nimsdelivery.Nimsdelivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Signupcontroller {
    @GetMapping("/signup")
    public String signup(){
        return "Signup";
    }
}
