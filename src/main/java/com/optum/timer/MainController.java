package com.optum.timer;

//import com.optum.timer.model.Activity;
//import com.optum.timer.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @GetMapping("/activity")
    public String activity() {
        return "activity";
    }

    @RequestMapping("/timer")
    public String timer() {
        return "timer";
    }

    @RequestMapping("/postActivity")
    public String postActivity() {
        System.out.println("HERE@");
        return "postActivity/index";
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


