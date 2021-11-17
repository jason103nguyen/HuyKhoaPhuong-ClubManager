package com.fa.training.entities;

import com.fa.training.dto.AdvertisingContractDto;

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

	@ManyToOne
    @JoinColumn(name = "fp_id", referencedColumnName = "fp_id")
    private FootballPlayer footballPlayer;
    
    @ManyToOne
	@JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    private Brand brand;

    @Column(name = "deal_value")
    private double dealValue;

    public AdvertisingContract() {
    }

    public AdvertisingContract(FootballPlayer footballPlayer, Brand brand, double dealValue) {
        this.footballPlayer = footballPlayer;
        this.brand = brand;
        this.dealValue = dealValue;
    }

    public AdvertisingContract(AdvertisingContractDto advertisingContractDto) {
        FootballPlayer footballPlayer = new FootballPlayer(advertisingContractDto.getFootballPlayerDto());
        this.footballPlayer = footballPlayer;

        Brand brand = new Brand(advertisingContractDto.getBrandDto());
        this.brand = brand;

        this.dealValue = dealValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FootballPlayer getFootballPlayer() {
        return footballPlayer;
    }

    public void setFootballPlayer(FootballPlayer footballPlayer) {
        this.footballPlayer = footballPlayer;
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
                ", footballPlayer=" + footballPlayer +
                ", brandId=" + brand.id +
                ", dealValue=" + dealValue +
                '}';
    }
}
