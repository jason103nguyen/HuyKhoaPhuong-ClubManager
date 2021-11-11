package com.fa.training.controller;

import com.fa.training.dto.FootballPlayerDto;
import com.fa.training.service.FootballPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class FootballPlayerController {

    private FootballPlayerService footballPlayerService;

    @Autowired
    public FootballPlayerController(FootballPlayerService footballPlayerService) {
        this.footballPlayerService = footballPlayerService;
    }

    @GetMapping(value = "/add-football-player")
    public String doGetAddFootballPlayer() {

        FootballPlayerDto footballPlayerDto = new FootballPlayerDto("Phuong", 1000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "14");

        footballPlayerService.create(footballPlayerDto);
        return "hello";
    }
}
