package com.fa.training.service;

import com.fa.training.dto.FootballPlayerDto;
import com.fa.training.exception.DatabaseException;

public interface FootballPlayerService {

    /**
     * Add a football player to database
     * @param footballPlayerDto
     */
    int create(FootballPlayerDto footballPlayerDto);

    /**
     * Get a football player by number of shirt
     * @return
     */
    FootballPlayerDto readByNumberOfShirt(String numberOfShirt) throws DatabaseException;

    /**
     * Get football player by id
     * @param id
     * @return
     */
    FootballPlayerDto readOne(int id) throws DatabaseException;

    /**
     * Update info of football player
     * @param footballPlayerDto
     */
    void updateOrCreate(FootballPlayerDto footballPlayerDto);

    /**
     * Delete a football player by id
     * @param id
     */
    void delete(int id) throws DatabaseException;
}
