package com.fa.training.dto;

import java.util.HashSet;
import java.util.Set;

import com.fa.training.entities.AdvertisingContract;
import com.fa.training.entities.Brand;

public class BrandDto {

	private int id;
	private String name;

	public BrandDto() {
	}
	
	public BrandDto(String name) {
		super();
		this.name = name;
	}

	public BrandDto(Brand brand) {
		super();
		this.id = brand.getId();
		this.name = brand.getName();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BrandDto{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
