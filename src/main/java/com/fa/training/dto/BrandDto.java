package com.fa.training.dto;

import java.util.HashSet;
import java.util.Set;

import com.fa.training.entities.AdvertisingContract;
import com.fa.training.entities.Brand;

public class BrandDto {

	int id;

	String name;

	private Set<AdvertisingContractDto> brandContracts = new HashSet<AdvertisingContractDto>();

	public BrandDto() {

	}

	public BrandDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public BrandDto(int id, String name, Set<AdvertisingContractDto> brandContracts) {
		super();
		this.id = id;
		this.name = name;
		this.brandContracts = brandContracts;
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

	public Set<AdvertisingContractDto> getBrandContracts() {
		return brandContracts;
	}

	public void setBrandContracts(Set<AdvertisingContractDto> brandContracts) {
		this.brandContracts = brandContracts;
	}

	public Brand dtoAsPersistent() {
		Brand b = new Brand();

		if (this.brandContracts != null && this.brandContracts.size() != 0) {
			Set<AdvertisingContract> newContracts = new HashSet<>();
			for (AdvertisingContractDto c : this.brandContracts) {
				newContracts.add(c.dtoAsPersistent());
			}
			b.setBrandContracts(newContracts);
		}
		if (this.id != 0) {
			b.setId(this.id);
		}
		
		b.setName(this.name);
		return b;
	}

	public BrandDto transformPersistentToDto(final Brand brand) {
		BrandDto brandDto = new BrandDto();

		brandDto.setId(brand.getId());
		brandDto.setName(brand.getName());
		brandDto.setBrandContracts(brandContracts);
		return brandDto;

	}

}
