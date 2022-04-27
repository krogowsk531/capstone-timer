package com.optum.timer.controller;

import com.optum.timer.model.Activity;
import com.optum.timer.model.User;
import com.optum.timer.service.ActivityService;
import com.optum.timer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;
import java.util.Set;

@Controller
public class MainController {

    private ActivityService activityService;

    private UserService userService;

    @Autowired
    public MainController(ActivityService activityService, UserService userService) {
        this.activityService = activityService;
        this.userService = userService;
    }

    @GetMapping("/")
    public String root(Model model, Principal principal) {
        User user = userService.findByEmail(principal.getName());
        Activity activity = new Activity();
        Set<Activity> activities = activityService.getActivitiesById(user.getId());
        model.addAttribute("activitiesList", activities);
        model.addAttribute("activity", activity);
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/timer")
    public String showTimer(Model model) {
        Activity activity = new Activity();
        model.addAttribute("displayTimer", activity);
        return "timer";
    }

    @GetMapping("/activity")
    public String activity(Model model) {
        Activity activity = new Activity();
        model.addAttribute("activity", activity);
        return "activity";
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



