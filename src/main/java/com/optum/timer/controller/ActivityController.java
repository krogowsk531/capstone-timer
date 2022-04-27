package com.optum.timer.controller;

import com.optum.timer.model.Activity;
import com.optum.timer.model.User;
import com.optum.timer.repository.ActivityRepository;
import com.optum.timer.repository.UserRepository;
import com.optum.timer.service.ActivityService;
import com.optum.timer.service.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;

@Controller
public class ActivityController {

    private ActivityRepository activityRepository;

    private UserRepository userRepository;

    private ActivityService activityService;

    private UserDetails userDetails;

    @Autowired
    public ActivityController(ActivityRepository activityRepository, UserRepository userRepository, ActivityService activityService, UserDetails userDetails) {
        this.activityRepository = activityRepository;
        this.activityService = activityService;
        this.userRepository = userRepository;
        this.userDetails = userDetails;
    }

    @GetMapping("/addNewActivity")
    public String addNewActivity(Model model, Principal principal) {
        User user = userRepository.findByEmail(principal.getName());
        Activity activity = new Activity();
        model.addAttribute("activity", activityService.getActivitiesById(user.getId()));
        return "index";
    }


    @PostMapping("/addNewActivity")
    public String saveNewActivity(@ModelAttribute("activity")Activity activity, Principal principal) {
        System.out.println("HERETOOO" + activity.getIntention());
        User user = userRepository.findByEmail(principal.getName());
        System.out.println(user);
        activityService.save(activity);
        user.getActivities().add(activity);
        userDetails.saveUser(user);
        return "redirect:/";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Activity> getAllActivities() {
        // This returns a JSON or XML with the users
        return activityRepository.findAll();
    }
}
