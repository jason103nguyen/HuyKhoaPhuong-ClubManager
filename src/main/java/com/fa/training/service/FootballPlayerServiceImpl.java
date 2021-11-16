package com.fa.training.service;

import com.fa.training.dao.FootballPlayerDaoImpl;
import com.fa.training.dto.FootballPlayerDto;
import com.fa.training.entities.FootballPlayer;
import com.fa.training.exception.DatabaseException;
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
    public int create(FootballPlayerDto footballPlayerDto) {

        FootballPlayer footballPlayer = new FootballPlayer(footballPlayerDto);
        int id = (int) footballPlayerDaoImpl.create(footballPlayer);
        return id;
    }

    /**
     * Get a football player by number of shirt
     * @return
     */
    public FootballPlayerDto readByNumberOfShirt(String numberOfShirt) throws DatabaseException {

        FootballPlayer footballPlayer = footballPlayerDaoImpl.readByNumberOfShirt(numberOfShirt);

        if (footballPlayer == null) {
            throw new DatabaseException("The number of shirt doesn't exists!");
        }
        return new FootballPlayerDto(footballPlayer);
    }

    /**
     * Get football player by id
     * @param id
     * @return
     */
    public FootballPlayerDto readOne(int id) throws DatabaseException {
        FootballPlayer footballPlayer = footballPlayerDaoImpl.readOne(id);
        if (footballPlayer == null) {
            throw new DatabaseException("The ID doesn't exists!");
        }
        return new FootballPlayerDto(footballPlayer);
    }

    /**
     * Update info of football player
     * @param footballPlayerDto
     */
    public void updateOrCreate(FootballPlayerDto footballPlayerDto) {
        FootballPlayer footballPlayer = new FootballPlayer(footballPlayerDto);
        footballPlayerDaoImpl.update(footballPlayer);
    }

    /**
     * Delete a football player by id
     * @param id
     */
    public void delete(int id) throws DatabaseException {

        FootballPlayer fb = footballPlayerDaoImpl.readOne(id);
        if (fb != null) {
            footballPlayerDaoImpl.delete(id);
        } else {
            throw new DatabaseException("The ID doesn't exists!");
        }

    }
}
