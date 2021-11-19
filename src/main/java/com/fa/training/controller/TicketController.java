package com.fa.training.controller;

import com.fa.training.dto.TicketDto;
import com.fa.training.exception.DatabaseException;
import com.fa.training.service.TicketService;
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
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping(value = "/add-ticket")
    public ModelAndView doGetAddTicket() {

        TicketDto ticketDto = new TicketDto();
        ModelAndView mv = new ModelAndView("addTicket");
        mv.addObject("ticket", ticketDto);

        return mv;
    }

    @PostMapping(value = "/add-ticket")
    public String doPostAddTicket(@ModelAttribute("ticket") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) TicketDto ticketDto) {

        ticketService.create(ticketDto);
        return "redirect:/list-ticket";
    }

    @GetMapping(value = "/list-ticket")
    public ModelAndView doGetListTicket() {

        List<TicketDto> listTicket = ticketService.readAll();
        ModelAndView mv = new ModelAndView("listTicket");
        mv.addObject("listTicket", listTicket);

        return mv;
    }

    @GetMapping(value = "/view-ticket")
    public ModelAndView doGetViewTicket(@RequestParam("id") int id) {

        TicketDto ticketDto = null;
        try {
            ticketDto = ticketService.readOne(id);
        } catch (DatabaseException ex) {
            System.out.println(ex.getMsgError());
        }

        ModelAndView mv = new ModelAndView("viewTicket");
        mv.addObject("ticket", ticketDto);
        return mv;
    }

    @GetMapping(value = "/edit-ticket")
    public ModelAndView doGetEditTicket(@RequestParam("id") int id) {

        TicketDto ticketDto = null;
        try {
            ticketDto = ticketService.readOne(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        ModelAndView mv = new ModelAndView("editTicket", "ticket", ticketDto);
        return mv;
    }

    @PostMapping(value = "/edit-ticket")
    public String doPostEditTicket(@ModelAttribute("ticket") TicketDto ticket) {

        ticketService.updateOrCreate(ticket);
        return "redirect:/list-ticket";
    }

    @GetMapping(value = "/delete-ticket")
    public String doGetDeleteTicket(@RequestParam("id") int id) {

        try {
            ticketService.delete(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        return "redirect:/list-ticket";
    }

}
