package com.gmail.ditritusa.controller;

import com.gmail.ditritusa.model.User;
import com.gmail.ditritusa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"home/welcome"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("username", "Welcome! " + user.getUsername());
        modelAndView.addObject("user_role", "Your'e role is " + user.getRoles());
        modelAndView.setViewName("home/welcome");
        return modelAndView;
    }
}
