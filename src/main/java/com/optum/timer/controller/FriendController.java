package com.optum.timer.controller;

import com.optum.timer.model.Friend;
import com.optum.timer.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.security.Principal;

@Controller
public class FriendController {

    private FriendService friendService;

    public FriendController() {

    }

    @Autowired
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping("/friends")
    public String getAllFriends(Model model) {
        model.addAttribute("listFriends", friendService.getAllFriends());
        return "friends";
    }

    @GetMapping("/showAddFriendForm")
    public  String showAddFriendForm(Model model) {
        Friend friend = new Friend();
        model.addAttribute("friend", friend);
        return "add_friend";
    }

    @PostMapping("/saveFriend")
    public String saveFriend(@ModelAttribute("friend") Friend friend, Principal principal, Model model) {
        friendService.saveFriend(friend);
        return "redirect:/friends";
    }

    @GetMapping("/showUpdateFriendForm/{id}")
    public String showUpdateFriendForm(@PathVariable(value = "id") long id, Model model) {
        Friend friend = friendService.getFriendById(id);
        model.addAttribute("friend", friend);
        return "update_friend";
    }

    @GetMapping("/deleteFriend/{id}")
    public String deleteFriend(@PathVariable(value = "id") long id) {
        this.friendService.deleteFriendById(id);
        return "redirect:/friends";
    }
}
