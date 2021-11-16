package com.fa.training.dto;

import com.fa.training.entities.AdvertisingContract;
import com.fa.training.entities.Brand;
import com.fa.training.entities.FootballPlayer;

public class AdvertisingContractDto {

	private int id;

	private FootballPlayerDto footballPlayerDto;

	private Brand brand;

	private double dealValue;

	public AdvertisingContractDto() {

	}

	public AdvertisingContractDto(FootballPlayerDto footballPlayerDto, Brand brand, double dealValue) {
		super();
		this.footballPlayerDto = footballPlayerDto;
		this.brand = brand;
		this.dealValue = dealValue;
	}

	public AdvertisingContractDto(int id, FootballPlayerDto footballPlayerDto, Brand brand, double dealValue) {
		super();
		this.id = id;
		this.footballPlayerDto = footballPlayerDto;
		this.brand = brand;
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public double getDealValue() {
		return dealValue;
	}

	public void setDealValue(double dealValue) {
		this.dealValue = dealValue;
	}

	public AdvertisingContract dtoAsPersistent() {
		AdvertisingContract a = new AdvertisingContract();
		a.setId(this.id);
		if (this.brand != null) {
			a.setBrand(this.brand);
		}

		FootballPlayer footballPlayer = new FootballPlayer(this.footballPlayerDto);
		a.setFootballPlayer(footballPlayer);
		a.setDealValue(this.dealValue);
		return a;
	}

}
