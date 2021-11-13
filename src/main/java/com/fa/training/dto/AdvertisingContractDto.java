package com.fa.training.dto;

import com.fa.training.entities.AdvertisingContract;
import com.fa.training.entities.Brand;

public class AdvertisingContractDto {

	private int id;

	private int playerId;

	private Brand brand;

	private double dealValue;

	public AdvertisingContractDto() {

	}

	public AdvertisingContractDto(int playerId, Brand brand, double dealValue) {
		super();
		this.playerId = playerId;
		this.brand = brand;
		this.dealValue = dealValue;
	}

	public AdvertisingContractDto(int id, int playerId, Brand brand, double dealValue) {
		super();
		this.id = id;
		this.playerId = playerId;
		this.brand = brand;
		this.dealValue = dealValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
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

		a.setPlayerId(this.playerId);
		a.setDealValue(this.dealValue);
		return a;
	}

}
