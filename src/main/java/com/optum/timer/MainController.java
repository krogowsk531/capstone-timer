package com.optum.timer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/timer")
    public String timer(Model model) {
        return "timer";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}


