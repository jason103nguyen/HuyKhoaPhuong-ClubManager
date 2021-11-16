package com.fa.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class Match1Controller {

    @Autowired
    private IMatchService iMatchService;

    public Match1Controller(IMatchService iMatchService) {
        this.iMatchService = iMatchService;
    }

    @GetMapping("/add-match")
    public String addGetMappingMatch() {

        MatchDto matchDto = new MatchDto(100000, LocalDate.parse("14-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")), LocalDate.parse("21-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),"MU lose Asernal 0 - 1 ",true,"MU - Asernal","USA's Stadium",10000,9000);

        iMatchService.create(matchDto);

        return "hello";
    }

    @GetMapping("/update-macha")
    public String updateGetMappingMatch(){

        MatchDto match1Dto = new MatchDto(100000, LocalDate.parse("14-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")), LocalDate.parse("21-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),"MU lose Asernal 0 - 1 ",true,"VietNam - Asernal","USA's Stadium",10000,9000);

        iMatch1Service.update(matchDto);

        return "hello";
    }

}
