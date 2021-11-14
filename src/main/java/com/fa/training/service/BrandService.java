package com.fa.training.service;

import com.fa.training.entities.Brand;
import com.fa.training.service.common.IOperations;

public interface BrandService extends IOperations<Brand> {
	
	public Brand findBrandByName(String name);
	
}
