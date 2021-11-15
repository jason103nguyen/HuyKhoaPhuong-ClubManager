package com.fa.training.controller;

import com.fa.training.dto.FootballPlayerDto;
import com.fa.training.exception.DatabaseException;
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

    @GetMapping(value = "/add-fb")
    public String addFootballPlayer() {

        FootballPlayerDto footballPlayerDto = new FootballPlayerDto("FB_1", 1000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "01");

        footballPlayerService.create(footballPlayerDto);
        return "hello";
    }

    @GetMapping(value = "/get-fb-number-shirt")
    public String getFbByNumberShirt() throws DatabaseException {

        FootballPlayerDto fb_1 = new FootballPlayerDto("FB_2", 1000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "02");

        footballPlayerService.create(fb_1);

        FootballPlayerDto fb_2 = footballPlayerService.readByNumberOfShirt(fb_1.getNumber());
        System.out.println(fb_2);

        return "hello";
    }

    @GetMapping(value = "/get-fb-id")
    public String getFbById() throws DatabaseException {

        FootballPlayerDto fb_1 = new FootballPlayerDto("FB_3", 1000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "03");

        int id = footballPlayerService.create(fb_1);

        FootballPlayerDto fb_2 = footballPlayerService.readOne(id);
        System.out.println(fb_2);

        return "hello";
    }

    @GetMapping(value = "/update-fb")
    public String updateFb() throws DatabaseException {

        FootballPlayerDto fb_1 = new FootballPlayerDto("FB_4", 1000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "04");

        int id = footballPlayerService.create(fb_1);
        System.out.println("Before update: " + fb_1.toString());

        FootballPlayerDto fb_2 = new FootballPlayerDto("FB_444", 1000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "04");
        fb_2.setId(id);
        footballPlayerService.updateOrCreate(fb_2);

        FootballPlayerDto fb_3 = footballPlayerService.readOne(id);
        System.out.println("After update: " + fb_3.toString());

        return "hello";
    }

    @GetMapping(value = "/delete-fb")
    public String deleteFb() throws DatabaseException {

        FootballPlayerDto fb_1 = new FootballPlayerDto("FB_5", 1000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                "05");

        int id = footballPlayerService.create(fb_1);

        footballPlayerService.delete(id);

        return "hello";
    }
}
