package com.optum.timer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/timer")
    public String timer() {
        return "timer";
    }

    @RequestMapping("/navigate")
    public String navigate() {
        return "navigate";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }


}


