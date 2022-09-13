package com.example.app.RestFlowerShopMySQL.controllers;

import com.example.app.RestFlowerShopMySQL.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FlowerController {
    @Autowired
    FlowerService service;

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("flowers", service.findAll());
        return "index";
    }
}
