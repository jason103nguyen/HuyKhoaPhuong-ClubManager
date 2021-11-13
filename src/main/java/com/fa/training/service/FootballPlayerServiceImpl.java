package com.fa.training.service;

import com.fa.training.dao.FootballPlayerDaoImpl;
import com.fa.training.dto.FootballPlayerDto;
import com.fa.training.entities.FootballPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballPlayerServiceImpl implements FootballPlayerService {

    private FootballPlayerDaoImpl footballPlayerDaoImpl;

    @Autowired
    public FootballPlayerServiceImpl(FootballPlayerDaoImpl footballPlayerDaoImpl) {
        this.footballPlayerDaoImpl = footballPlayerDaoImpl;
    }

    /**
     * Add a football player to database
     * @param footballPlayerDto
     */
    public void create(FootballPlayerDto footballPlayerDto) {
        footballPlayerDaoImpl.create(new FootballPlayer(footballPlayerDto));
    }

    /**
     * Get a football player by number of shirt
     * @return
     */
    public FootballPlayerDto readByNumberOfShirt(String numberOfShirt) {

        FootballPlayer footballPlayer = footballPlayerDaoImpl.readByNumberOfShirt(numberOfShirt);
        return new FootballPlayerDto(footballPlayer);
    }
}
