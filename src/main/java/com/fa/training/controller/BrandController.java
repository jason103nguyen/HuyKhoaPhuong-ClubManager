package com.fa.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fa.training.dto.BrandDto;
import com.fa.training.service.BrandService;
import com.fa.training.service.impl.BrandServiceImpl;

@Controller
public class BrandController {
	
	private BrandService brandService;
	 
	@Autowired
	public BrandController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}

	@GetMapping(value = "/add-brand")
	public String doGetAddBrand() {

		BrandDto dto = new BrandDto();
		dto.setName("Nike");
		brandService.create(dto.dtoAsPersistent());
		return "brandCreated";
	}
}
