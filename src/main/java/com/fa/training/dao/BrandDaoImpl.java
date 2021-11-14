package com.fa.training.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.fa.training.entities.Brand;

@Repository
public class BrandDaoImpl extends AbstractDao<Brand>  {
	
	@Autowired
	    public BrandDaoImpl(LocalSessionFactoryBean sessionFactory) {
	        super(Brand.class, sessionFactory);
	    }
}
