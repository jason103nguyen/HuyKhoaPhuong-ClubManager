package com.fa.training.service.impl;

import com.fa.training.service.BrandService;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.training.dao.BrandDaoImpl;
import com.fa.training.dao.FootballPlayerDaoImpl;
import com.fa.training.entities.Brand;
import com.fa.training.service.common.AbstractService;
import com.fa.training.service.common.IOperations;

@Service
public class BrandServiceImpl extends AbstractService<Brand> implements BrandService {

	BrandDaoImpl brandDao;

	@Autowired
	public BrandServiceImpl(BrandDaoImpl brandDao) {
		this.brandDao = brandDao;
	}

	@Override
	public Brand findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brand findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable create(Brand entity) {
		// TODO Auto-generated method stub
		return brandDao.create(entity);

	}

	@Override
	public void update(Brand entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Brand entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long entityId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String entityId) {
		// TODO Auto-generated method stub

	}

	@Override
	public long findRecordsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Brand findBrandByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IOperations<Brand> getDao() {
		// TODO Auto-generated method stub
		return brandDao;
	}
}
