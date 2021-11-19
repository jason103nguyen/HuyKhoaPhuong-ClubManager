package com.fa.training.service;

import com.fa.training.constants_file.ConstantString;
import com.fa.training.dao.FootballPlayerDaoImpl;
import com.fa.training.dto.FootballPlayerDto;
import com.fa.training.entities.FootballPlayer;
import com.fa.training.exception.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class FootballPlayerServiceImpl implements FootballPlayerService {

    private FootballPlayerDaoImpl footballPlayerDaoImpl;

    @Autowired
    public FootballPlayerServiceImpl(FootballPlayerDaoImpl footballPlayerDaoImpl) {
        this.footballPlayerDaoImpl = footballPlayerDaoImpl;
        createSampleFb();
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
     * Get all football player
     * @return
     */
    public List<FootballPlayerDto> readAll() {
        List<FootballPlayer> listFb = footballPlayerDaoImpl.readAll();
        List<FootballPlayerDto> listFbDto = new ArrayList<>();

        for (FootballPlayer fb : listFb) {
            FootballPlayerDto fbDto = new FootballPlayerDto(fb);
            listFbDto.add(fbDto);
        }

        return listFbDto;
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

    /**
     * Create sample football player in database
     */
    public void createSampleFb() {

        FootballPlayerDto fb_1 = new FootballPlayerDto("Cristiano Ronaldo", 10000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern(ConstantString.DD_MM_YYYY)),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern(ConstantString.DD_MM_YYYY)),
                "7");
        FootballPlayerDto fb_2 = new FootballPlayerDto("Lionel Messi", 11000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern(ConstantString.DD_MM_YYYY)),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern(ConstantString.DD_MM_YYYY)),
                "11");
        FootballPlayerDto fb_3 = new FootballPlayerDto("Kylian Mbappé", 12000,
                LocalDate.parse("11-11-2021", DateTimeFormatter.ofPattern(ConstantString.DD_MM_YYYY)),
                LocalDate.parse("11-11-2025", DateTimeFormatter.ofPattern(ConstantString.DD_MM_YYYY)),
                "10");

        create(fb_1);
        create(fb_2);
        create(fb_3);
    }
}
