package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(@RequestParam(required = false) Integer number,
            @RequestParam(required = false) String name,
            Model model) {
        if (number == null || name == null) {
            number = 0;
            name = "John Smith";
        }
        model.addAttribute("doctorName", name);
        model.addAttribute("doctorNumber", number);
        return "doctor";
    }
}
