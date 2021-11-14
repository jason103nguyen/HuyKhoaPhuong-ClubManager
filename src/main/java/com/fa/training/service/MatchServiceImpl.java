package com.fa.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements IMatchService {
    @Autowired
    private MatchDaoImpl matchDaoImpl;

    public MatchServiceImpl(MatchDaoImpl matchDaoImpl) {
        this.matchDaoImpl = matchDaoImpl;
    }

    @Override
    public void create(MatchDto matchDto) {
        Match match = new Match(matchDto);
        matchDaoImpl.create(match);
    }

    @Override
    public void update(MatchDto matchDto) {
        Match match = new Match(matchDto);
        matchDaoImpl.update(match);
    }

}