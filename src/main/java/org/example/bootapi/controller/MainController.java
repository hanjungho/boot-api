package org.example.bootapi.controller;

import org.example.bootapi.model.form.DiaryForm;
import org.example.bootapi.service.StorageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
    private final StorageService storageService;

    public MainController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "카피바라!");
        model.addAttribute("message", "즐거운 하루!");
        model.addAttribute("form", DiaryForm.empty());
        return "index";
    }

    @PostMapping
    public String post(DiaryForm form, RedirectAttributes redirectAttributes) throws Exception {
        String imageName = storageService.upload(form.file());
        redirectAttributes.addFlashAttribute("image", imageName);
        return "redirect:/";
    }
}
