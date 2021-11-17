package com.fa.training.dao;

import com.fa.training.entities.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BrandDaoImpl extends AbstractDao<Brand> {

    @Autowired
    public BrandDaoImpl(LocalSessionFactoryBean sessionFactory) {
        super(Brand.class, sessionFactory);
    }
}