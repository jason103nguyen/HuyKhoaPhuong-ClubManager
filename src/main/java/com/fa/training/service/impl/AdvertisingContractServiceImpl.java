package com.fa.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fa.training.dao.BrandDao;
import com.fa.training.entities.AdvertisingContract;
import com.fa.training.service.AdvertisingContractService;
import com.fa.training.service.common.AbstractService;
import com.fa.training.service.common.IOperations;

public class AdvertisingContractServiceImpl extends AbstractService<AdvertisingContract> implements AdvertisingContractService{
	@Autowired(required = true)
	BrandDao brandDao;
	
	@Override
	protected IOperations<AdvertisingContract> getDao() {
		// TODO Auto-generated method stub
		return null;
	}
}
