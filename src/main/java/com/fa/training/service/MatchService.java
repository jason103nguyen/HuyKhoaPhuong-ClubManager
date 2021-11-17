package com.fa.training.service;

import com.fa.training.dto.MatchDto;
import com.fa.training.exception.DatabaseException;

public interface MatchService {

    /**
     * Add a match to database
     * @param matchDto
     */
    public int create(MatchDto matchDto);

    /**
     * Get match by id
     * @param id
     * @return
     */
    public MatchDto readOne(int id) throws DatabaseException;

    /**
     * Update or create a match
     * @param matchDto
     */
    public void updateOrCreate(MatchDto matchDto);

    /**
     * Delete a advertisingContract by id
     * @param id
     */
    public void delete(int id) throws DatabaseException;
}
