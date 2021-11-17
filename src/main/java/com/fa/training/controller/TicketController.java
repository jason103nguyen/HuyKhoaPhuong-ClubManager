//package com.fa.training.controller;
//
//import com.fa.training.dto.Match1Dto;
//import com.fa.training.dto.TicketDto;
//import com.fa.training.service.ITicketService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//@Controller
//public class TicketController {
//
//    @Autowired
//    private ITicketService iTicketService;
//
//    public TicketController(ITicketService iTicketService) {
//        this.iTicketService = iTicketService;
//    }
//
//    @GetMapping("/add-ticket")
//    public String addGetMappingTicket() {
//
//        Match1Dto match1Dto = new Match1Dto(100000, LocalDate.parse("14-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")), LocalDate.parse("21-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),"MU lose Asernal 0 - 1 ",true,"MU - Asernal","USA's Stadium",10000,9000);
//
//        TicketDto ticketDto = new TicketDto(match1Dto, 100000);
//
//        iTicketService.create(ticketDto);
//
//        return "hello";
//    }
//}
