package com.fa.training.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class MatchDaoImpl extends AbstractDao<Match> {

    @Autowired
    private LocalSessionFactoryBean localSessionFactoryBean;

    public MatchDaoImpl(LocalSessionFactoryBean localSessionFactoryBean) {
        super(Match.class, localSessionFactoryBean);
    }
}
