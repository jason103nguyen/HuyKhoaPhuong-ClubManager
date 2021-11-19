package com.fa.training.controller;

import com.fa.training.dto.BrandDto;
import com.fa.training.exception.DatabaseException;
import com.fa.training.service.BrandService;
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
public class BrandController {

    private BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping(value = "/add-brand")
    public ModelAndView doGetAddBrand() {

        BrandDto brandDto = new BrandDto();
        ModelAndView mv = new ModelAndView("addBrand");
        mv.addObject("brand", brandDto);

        return mv;
    }

    @PostMapping(value = "/add-brand")
    public String doPostAddBrand(@ModelAttribute("brand") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) BrandDto brandDto) {

        brandService.create(brandDto);
        return "redirect:/list-brand";
    }

    @GetMapping(value = "/list-brand")
    public ModelAndView doGetListBrand() {

        List<BrandDto> listBrand = brandService.readAll();
        ModelAndView mv = new ModelAndView("listBrand");
        mv.addObject("listBrand", listBrand);

        return mv;
    }

    @GetMapping(value = "/view-brand")
    public ModelAndView doGetViewBrand(@RequestParam("id") int id) {

        BrandDto brandDto = null;
        try {
            brandDto = brandService.readOne(id);
        } catch (DatabaseException ex) {
            System.out.println(ex.getMsgError());
        }

        ModelAndView mv = new ModelAndView("viewBrand");
        mv.addObject("brand", brandDto);
        return mv;
    }

    @GetMapping(value = "/edit-brand")
    public ModelAndView doGetEditBrand(@RequestParam("id") int id) {

        BrandDto brandDto = null;
        try {
            brandDto = brandService.readOne(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        ModelAndView mv = new ModelAndView("editBrand", "brand", brandDto);
        return mv;
    }

    @PostMapping(value = "/edit-brand")
    public String doPostEditBrand(@ModelAttribute("brand") BrandDto brand) {

        brandService.updateOrCreate(brand);
        return "redirect:/list-brand";
    }

    @GetMapping(value = "/delete-brand")
    public String doGetDeleteBrand(@RequestParam("id") int id) {

        try {
            brandService.delete(id);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
        return "redirect:/list-brand";
    }

}
