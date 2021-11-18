package com.fa.training.dao;

import com.fa.training.entities.AdvertisingContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AdvertisingContractDaoImpl extends AbstractDao<AdvertisingContract> {

    @Autowired
    public AdvertisingContractDaoImpl(LocalSessionFactoryBean sessionFactory) {
        super(AdvertisingContract.class, sessionFactory);
    }
}