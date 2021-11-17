package com.fa.training.dto;

import com.fa.training.entities.AdvertisingContract;
import com.fa.training.entities.Brand;
import com.fa.training.entities.FootballPlayer;

public class AdvertisingContractDto {

	private int id;
	private FootballPlayerDto footballPlayerDto;
	private BrandDto brandDto;
	private double dealValue;

	public AdvertisingContractDto() {
	}

	public AdvertisingContractDto(FootballPlayerDto footballPlayerDto, BrandDto brandDto, double dealValue) {
		super();
		this.footballPlayerDto = footballPlayerDto;
		this.brandDto = brandDto;
		this.dealValue = dealValue;
	}

	public AdvertisingContractDto(AdvertisingContract advertisingContract) {
		super();
		this.id = advertisingContract.getId();
		FootballPlayerDto footballPlayerDto = new FootballPlayerDto(advertisingContract.getFootballPlayer());
		this.footballPlayerDto = footballPlayerDto;
		BrandDto brandDto = new BrandDto(advertisingContract.getBrand());
		this.brandDto = brandDto;
		this.dealValue = dealValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FootballPlayerDto getFootballPlayerDto() {
		return footballPlayerDto;
	}

	public void setFootballPlayerDto(FootballPlayerDto footballPlayerDto) {
		this.footballPlayerDto = footballPlayerDto;
	}

	public BrandDto getBrandDto() {
		return brandDto;
	}

	public void setBrandDto(BrandDto brandDto) {
		this.brandDto = brandDto;
	}

	public double getDealValue() {
		return dealValue;
	}

	public void setDealValue(double dealValue) {
		this.dealValue = dealValue;
	}

}
