package com.fa.training.dao;

import com.fa.training.entities.FootballPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class FootballPlayerDaoImpl extends AbstractDao<FootballPlayer> {

    private LocalSessionFactoryBean sessionFactory;

    @Autowired
    public FootballPlayerDaoImpl(LocalSessionFactoryBean sessionFactory) {
        super(FootballPlayer.class, sessionFactory);
    }

    /**
     * Get football player by number of shirt
     * @return
     */
    public FootballPlayer readByNumberOfShirt(String numberOfShirt) {

        ArrayList<FootballPlayer> listFootballPlayer = (ArrayList<FootballPlayer>) likeOperator("numberOfShirt", numberOfShirt);
        return listFootballPlayer.get(0);
    }
}