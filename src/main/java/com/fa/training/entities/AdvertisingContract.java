package com.fa.training.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "advertising_contract")
public class AdvertisingContract {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private int id;
    
    private int playerId;
    
    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "brand_id")
    private Brand brand;
    
    private double dealValue;

    public AdvertisingContract() {
    }

    public AdvertisingContract(int playerId, Brand brand, double dealValue) {
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

    @Override
    public String toString() {
        return "AdvertisingContract{" +
                "id=" + id +
                ", playerId=" + playerId +
                ", brandId=" + brand.id +
                ", dealValue=" + dealValue +
                '}';
    }
}
