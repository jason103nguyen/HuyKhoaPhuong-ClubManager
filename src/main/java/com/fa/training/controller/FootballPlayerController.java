package com.fa.training.controller;

import com.fa.training.service.FootballPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FootballPlayerController {

    private FootballPlayerService footballPlayerService;

    @Autowired
    public FootballPlayerController(FootballPlayerService footballPlayerService) {
        this.footballPlayerService = footballPlayerService;
    }

    @GetMapping(value = "/add-football-player")
    public String doGetAddFootballPlayer() {

        return "hello";
    }
}
