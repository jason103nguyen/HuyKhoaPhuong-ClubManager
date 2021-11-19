package com.fa.training.service;

import com.fa.training.dto.TicketDto;
import com.fa.training.exception.DatabaseException;

import java.util.List;

public interface TicketService {

    /**
     * Add a ticket to database
     * @param ticketDto
     */
    public int create(TicketDto ticketDto);

    /**
     * Get ticket by id
     * @param id
     * @return
     */
    public TicketDto readOne(int id) throws DatabaseException;

    /**
     * Get all ticket
     * @return
     */
    public List<TicketDto> readAll();

    /**
     * Update or create a ticket
     * @param ticketDto
     */
    public void updateOrCreate(TicketDto ticketDto);

    /**
     * Delete a advertisingContract by id
     * @param id
     */
    public void delete(int id) throws DatabaseException;
}
