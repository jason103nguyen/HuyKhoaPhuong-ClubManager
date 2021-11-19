package com.fa.training.controller;

import com.fa.training.dto.AdvertisingContractDto;
import com.fa.training.exception.DatabaseException;
import com.fa.training.service.AdvertisingContractService;
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
public class AdvertisingContractController {

    private AdvertisingContractService advertisingContractService;

    @Autowired
    public AdvertisingContractController(AdvertisingContractService advertisingContractService) {
        this.advertisingContractService = advertisingContractService;
    }

    @GetMapping(value = "/add-ad")
    public ModelAndView doGetAddAdvertisingContract() {

        AdvertisingContractDto advertisingContractDto = new AdvertisingContractDto();
        ModelAndView mv = new ModelAndView("addAd");
        mv.addObject("ad", advertisingContractDto);

        return mv;
    }

    @PostMapping(value = "/add-ad")
    public String doPostAddAd(@ModelAttribute("ad") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) AdvertisingContractDto advertisingContractDto) {

        advertisingContractService.create(advertisingContractDto);
        return "redirect:/list-ad";
    }

    @GetMapping(value = "/list-ad")
    public ModelAndView doGetListAd() {

        List<AdvertisingContractDto> listAd = advertisingContractService.readAll();
        ModelAndView mv = new ModelAndView("listAd");
        mv.addObject("listAd", listAd);

        return mv;
    }

    @GetMapping(value = "/view-ad")
    public ModelAndView doGetViewAd(@RequestParam("id") int id) {

        AdvertisingContractDto advertisingContractDto = null;
        try {
            advertisingContractDto = advertisingContractService.readOne(id);
        } catch (DatabaseException ex) {
            System.out.println(ex.getMsgError());
        }

        ModelAndView mv = new ModelAndView("viewAd");
        mv.addObject("ad", advertisingContractDto);
        return mv;
    }

    @GetMapping(value = "/edit-ad")
    public ModelAndView doGetEditAd(@RequestParam("id") int id) {

        AdvertisingContractDto advertisingContractDto = null;
        try {
            advertisingContractDto = advertisingContractService.readOne(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        ModelAndView mv = new ModelAndView("editAd", "ad", advertisingContractDto);
        return mv;
    }

    @PostMapping(value = "/edit-ad")
    public String doPostEditAd(@ModelAttribute("ad") AdvertisingContractDto ad) {

        advertisingContractService.updateOrCreate(ad);
        return "redirect:/list-ad";
    }

    @GetMapping(value = "/delete-ad")
    public String doGetDeleteAd(@RequestParam("id") int id) {

        try {
            advertisingContractService.delete(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        return "redirect:/list-ad";
    }

}
