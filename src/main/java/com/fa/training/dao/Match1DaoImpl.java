package com.fa.training.dao;

import com.fa.training.entities.Match1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class Match1DaoImpl extends AbstractDao<Match1> {

    @Autowired
    private LocalSessionFactoryBean localSessionFactoryBean;

    public Match1DaoImpl(LocalSessionFactoryBean localSessionFactoryBean) {
        super(Match1.class, localSessionFactoryBean);
    }
}
