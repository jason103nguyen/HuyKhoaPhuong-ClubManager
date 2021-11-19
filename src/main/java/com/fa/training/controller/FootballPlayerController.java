package com.fa.training.controller;

import com.fa.training.constants_file.ConstantString;
import com.fa.training.dto.FootballPlayerDto;
import com.fa.training.exception.DatabaseException;
import com.fa.training.service.FootballPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FootballPlayerController {

    private FootballPlayerService footballPlayerService;

    @Autowired
    public FootballPlayerController(FootballPlayerService footballPlayerService) {
        this.footballPlayerService = footballPlayerService;
    }

    @GetMapping(value = "/add-fb")
    public ModelAndView doGetAddFootballPlayer() {

        FootballPlayerDto footballPlayerDto = new FootballPlayerDto();
        ModelAndView mv = new ModelAndView("addFb");
        mv.addObject("footballPlayer", footballPlayerDto);

        return mv;
    }

    @PostMapping(value = "/add-fb")
    public String doPostAddFootballPlayer(@ModelAttribute("footballPlayer") FootballPlayerDto footballPlayerDto) {

        footballPlayerService.create(footballPlayerDto);
        return "redirect:/list-fb";
    }

    @GetMapping(value = "/list-fb")
    public ModelAndView doGetListFb() {

        List<FootballPlayerDto> listFb = footballPlayerService.readAll();
        ModelAndView mv = new ModelAndView("listFb");
        mv.addObject("listFb", listFb);

        return mv;
    }

    @GetMapping(value = "/view-fb")
    public ModelAndView doGetViewFb(@RequestParam("id") int id) {

        FootballPlayerDto fbDto = null;
        try {
            fbDto = footballPlayerService.readOne(id);
        } catch (DatabaseException ex) {
            System.out.println(ex.getMsgError());
        }

        ModelAndView mv = new ModelAndView("viewFb");
        mv.addObject("fb", fbDto);
        return mv;
    }

    @GetMapping(value = "/edit-fb")
    public ModelAndView doGetEditFb(@RequestParam("id") int id) {

        FootballPlayerDto fbDto = null;
        try {
            fbDto = footballPlayerService.readOne(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        ModelAndView mv = new ModelAndView("editFb", "fb", fbDto);
        return mv;
    }

    @PostMapping(value = "/edit-fb")
    public String doPostEditFb(@ModelAttribute("fb") FootballPlayerDto fb) {

        footballPlayerService.updateOrCreate(fb);
        return "redirect:/list-fb";
    }

    @GetMapping(value = "/delete-fb")
    public String doGetDeleteFb(@RequestParam("id") int id) {

        try {
            footballPlayerService.delete(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        return "redirect:/list-fb";
    }

}
