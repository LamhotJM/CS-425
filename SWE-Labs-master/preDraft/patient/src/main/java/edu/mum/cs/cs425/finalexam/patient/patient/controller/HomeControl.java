package edu.mum.cs.cs425.finalexam.patient.patient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControl {

    @GetMapping(value = {"/", "home"})
    public String home(){
        return "home/index";
    }
}
