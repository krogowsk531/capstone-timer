package com.optum.timer.controller;

import com.optum.timer.model.Activity;
import com.optum.timer.model.Comment;
import com.optum.timer.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class CommentController<model> {

    private CommentService commentService;

    public CommentController() {

    }

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    public String getAllComments(Model model) {
        model.addAttribute("listComments", commentService.getAllComments());
        return "comments";
    }

    @GetMapping("/showNewCommentForm")
    public String showNewCommentForm(Model model) {
        Comment comment = new Comment();
        model.addAttribute("comment", comment);
        return "new_comment";
    }

    @PostMapping("/saveComment")
    public String saveComment(@ModelAttribute("comment") Comment comment, Principal principal, Model model) {
        commentService.saveComment(comment);
        return "redirect:/comments";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get employee from the service
        Comment comment = commentService.getCommentById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("comment", comment);
        return "update_comment";
    }

    @GetMapping("/deleteComment/{id}")
    public String deleteComment(@PathVariable(value = "id") long id) {
        this.commentService.deleteCommentById(id);
        return "redirect:/comments";
    }
}
