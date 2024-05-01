package com.amrwalidi.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amrwalidi.springboot.model.User;

@Controller
public class HomeController {

    @GetMapping("/")
    public String Home() {
        return "index.html";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model) {
        System.out.println(user.toString());
        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getDob());
        System.out.println(user.getEmail());
        model.addAttribute("firstname", user.getFname());
        model.addAttribute("lastname", user.getLname());
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome.html";
    }

}
