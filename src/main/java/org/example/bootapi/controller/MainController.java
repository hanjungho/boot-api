package org.example.bootapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "카피바라!");
        model.addAttribute("message", "깨비드릴조");
        return "index";
    }
}
