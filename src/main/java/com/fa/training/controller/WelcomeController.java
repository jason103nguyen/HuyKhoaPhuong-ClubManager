package com.fa.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add-user", method = RequestMethod.GET)
    public String addUser() {

        userService.create(new User("Huong", "2222", "huong@gmail.com"));

        return "home.jsp";
    }

    @GetMapping(value = "/hello")
    public String doGetHello() {

        return "hello";
    }
}
