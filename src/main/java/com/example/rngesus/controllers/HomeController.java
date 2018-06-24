package com.example.rngesus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Welcome to RNGesus");

        return "index";
    }

    @RequestMapping(value = "create")
    public String create(Model model) {
        model.addAttribute("title", "Create");

        return "create";
    }

}
