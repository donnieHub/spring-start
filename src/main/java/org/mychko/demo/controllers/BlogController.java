package org.mychko.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String goToBlog(Model model) {
        model.addAttribute("title", "Блог");
        return "blog-main";
    }
}
