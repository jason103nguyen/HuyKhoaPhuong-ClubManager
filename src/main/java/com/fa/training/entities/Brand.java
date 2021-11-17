package com.fa.training.entities;

import com.fa.training.dto.BrandDto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "brand")
public class Brand {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
	int id;
	
	@Column(name = "brand_name")
	@NotNull
	String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "brand", fetch = FetchType.LAZY)
	private Set<AdvertisingContract> brandContracts = new HashSet<>();
	
	public Brand() {
	}
	
	public Brand(String name) {
		this.name = name;
	}

	public Brand(BrandDto brandDto) {
		this.name = brandDto.getName();
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

	public Set<AdvertisingContract> getBrandContracts() {
		return brandContracts;
	}

	public void setBrandContracts(Set<AdvertisingContract> brandContracts) {
		this.brandContracts = brandContracts;
	}

	@Override
	public String toString() {
		return "Brand{" +
				"id=" + id +
				", name='" + name + '\'' +
				", brandContracts=" + brandContracts +
				'}';
	}
}
