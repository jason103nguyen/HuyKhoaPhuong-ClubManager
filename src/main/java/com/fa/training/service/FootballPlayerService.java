package com.fa.training.service;

import com.fa.training.dto.FootballPlayerDto;

public interface FootballPlayerService {

    /**
     * Add a football player to database
     * @param footballPlayerDto
     */
    void create(FootballPlayerDto footballPlayerDto);

    /**
     * Get a football player by number of shirt
     * @return
     */
    FootballPlayerDto readByNumberOfShirt(String numberOfShirt);
}
