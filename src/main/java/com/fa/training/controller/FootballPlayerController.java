package com.fa.training.controller;

import com.fa.training.service.FootballPlayerService;
import com.fa.training.service.FootballPlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FootballPlayerController {

    private FootballPlayerServiceImpl footballPlayerServiceImpl;

    @Autowired
    public FootballPlayerController(FootballPlayerServiceImpl footballPlayerServiceImpl) {
        this.footballPlayerServiceImpl = footballPlayerServiceImpl;
    }

    @GetMapping(value = "/add-football-player")
    public String doGetAddFootballPlayer() {

        return "hello";
    }
}
