package com.fa.training.service;

import com.fa.training.dao.MatchDaoImpl;
import com.fa.training.dto.MatchDto;
import com.fa.training.entities.Match;
import com.fa.training.exception.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService {

    private MatchDaoImpl matchDaoImpl;

    @Autowired
    public MatchServiceImpl(MatchDaoImpl matchDaoImpl) {
        this.matchDaoImpl = matchDaoImpl;
    }

    /**
     * Add a match to database
     * @param matchDto
     */
    public int create(MatchDto matchDto) {

        Match match = new Match(matchDto);
        int id = (int) matchDaoImpl.create(match);
        return id;
    }

    /**
     * Get match by id
     * @param id
     * @return
     */
    public MatchDto readOne(int id) throws DatabaseException {
        Match match = matchDaoImpl.readOne(id);
        if (match == null) {
            throw new DatabaseException("The ID doesn't exists!");
        }
        return new MatchDto(match);
    }

    /**
     * Update or create a match
     * @param matchDto
     */
    public void updateOrCreate(MatchDto matchDto) {
        Match match = new Match(matchDto);
        matchDaoImpl.update(match);
    }

    /**
     * Delete a match by id
     * @param id
     */
    public void delete(int id) throws DatabaseException {

        Match match = matchDaoImpl.readOne(id);
        if (match != null) {
            matchDaoImpl.delete(id);
        } else {
            throw new DatabaseException("The ID doesn't exists!");
        }

    }
}