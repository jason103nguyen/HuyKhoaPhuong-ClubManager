//package com.fa.training.controller;
//
//import com.fa.training.dto.Match1Dto;
//import com.fa.training.service.IMatch1Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//@Controller
//public class Match1Controller {
//
//    @Autowired
//    private IMatch1Service iMatch1Service;
//
//    public Match1Controller(IMatch1Service iMatch1Service) {
//        this.iMatch1Service = iMatch1Service;
//    }
//
//    @GetMapping("/add-match1")
//    public String addGetMappingMatch() {
//
//        Match1Dto match1Dto = new Match1Dto(100000, LocalDate.parse("14-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")), LocalDate.parse("21-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),"MU lose Asernal 0 - 1 ",true,"MU - Asernal","USA's Stadium",10000,9000);
//
//        iMatch1Service.create(match1Dto);
//
//        return "hello";
//    }
//
//    @GetMapping("/update-macha1")
//    public String updateGetMappingMatch(){
//
//        Match1Dto match1Dto = new Match1Dto(100000, LocalDate.parse("14-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")), LocalDate.parse("21-11-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy")),"MU lose Asernal 0 - 1 ",true,"VietNam - Asernal","USA's Stadium",10000,9000);
//
//        iMatch1Service.update(match1Dto);
//
//        return "hello";
//    }
//
//
//}
