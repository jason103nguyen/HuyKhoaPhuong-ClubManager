package com.fa.training.controller;

import com.fa.training.dto.MatchDto;
import com.fa.training.exception.DatabaseException;
import com.fa.training.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MatchController {

    private MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping(value = "/add-match")
    public ModelAndView doGetAddMatch() {

        MatchDto matchDto = new MatchDto();
        ModelAndView mv = new ModelAndView("addMatch");
        mv.addObject("match", matchDto);

        return mv;
    }

    @PostMapping(value = "/add-match")
    public String doPostAddMatch(@ModelAttribute("match") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) MatchDto matchDto) {

        matchService.create(matchDto);
        return "redirect:/list-match";
    }

    @GetMapping(value = "/list-match")
    public ModelAndView doGetListMatch() {

        List<MatchDto> listMatch = matchService.readAll();
        ModelAndView mv = new ModelAndView("listMatch");
        mv.addObject("listMatch", listMatch);

        return mv;
    }

    @GetMapping(value = "/view-match")
    public ModelAndView doGetViewMatch(@RequestParam("id") int id) {

        MatchDto matchDto = null;
        try {
            matchDto = matchService.readOne(id);
        } catch (DatabaseException ex) {
            System.out.println(ex.getMsgError());
        }

        ModelAndView mv = new ModelAndView("viewMatch");
        mv.addObject("match", matchDto);
        return mv;
    }

    @GetMapping(value = "/edit-match")
    public ModelAndView doGetEditMatch(@RequestParam("id") int id) {

        MatchDto matchDto = null;
        try {
            matchDto = matchService.readOne(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        ModelAndView mv = new ModelAndView("editMatch", "match", matchDto);
        return mv;
    }

    @PostMapping(value = "/edit-match")
    public String doPostEditMatch(@ModelAttribute("match") MatchDto match) {

        matchService.updateOrCreate(match);
        return "redirect:/list-match";
    }

    @GetMapping(value = "/delete-match")
    public String doGetDeleteMatch(@RequestParam("id") int id) {

        try {
            matchService.delete(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        return "redirect:/list-match";
    }

}
