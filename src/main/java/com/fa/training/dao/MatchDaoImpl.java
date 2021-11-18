package com.fa.training.dao;

import com.fa.training.entities.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class MatchDaoImpl extends AbstractDao<Match> {

    @Autowired
    public MatchDaoImpl(LocalSessionFactoryBean sessionFactory) {
        super(Match.class, sessionFactory);
    }
}
