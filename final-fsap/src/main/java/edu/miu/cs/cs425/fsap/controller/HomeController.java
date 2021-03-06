package edu.miu.cs.cs425.fsap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/fsap", "/fsap/home"})
    public String displayHomepage() {
        return "home/index";
    }

}
