package com.fa.training.service;

import com.fa.training.dao.Match1DaoImpl;
import com.fa.training.dto.Match1Dto;
import com.fa.training.entities.Match1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Match1ServiceImpl implements IMatch1Service {

    @Autowired
    private Match1DaoImpl match1DaoImpl;

    public Match1ServiceImpl(Match1DaoImpl match1DaoImpl) {
        this.match1DaoImpl = match1DaoImpl;
    }

    @Override
    public void create(Match1Dto match1Dto) {
        Match1 match1 = new Match1(match1Dto);
        match1DaoImpl.create(match1);
    }

    @Override
    public void update(Match1Dto match1Dto) {
        Match1 match1 = new Match1(match1Dto);
        match1DaoImpl.update(match1);
    }

}