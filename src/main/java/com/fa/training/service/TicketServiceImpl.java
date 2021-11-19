package com.fa.training.service;

import com.fa.training.dao.TicketDaoImpl;
import com.fa.training.dto.TicketDto;
import com.fa.training.dto.TicketDto;
import com.fa.training.entities.Ticket;
import com.fa.training.entities.Ticket;
import com.fa.training.exception.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private TicketDaoImpl ticketDaoImpl;

    @Autowired
    public TicketServiceImpl(TicketDaoImpl ticketDaoImpl) {
        this.ticketDaoImpl = ticketDaoImpl;
    }

    /**
     * Add a ticket to database
     * @param ticketDto
     */
    public int create(TicketDto ticketDto) {

        Ticket ticket = new Ticket(ticketDto);
        int id = (int) ticketDaoImpl.create(ticket);
        return id;
    }

    /**
     * Get ticket by id
     * @param id
     * @return
     */
    public TicketDto readOne(int id) throws DatabaseException {
        Ticket ticket = ticketDaoImpl.readOne(id);
        if (ticket == null) {
            throw new DatabaseException("The ID doesn't exists!");
        }
        return new TicketDto(ticket);
    }

    /**
     * Get all ticket
     * @return
     */
    public List<TicketDto> readAll() {
        List<Ticket> listTicket = ticketDaoImpl.readAll();
        List<TicketDto> listTicketDto = new ArrayList<>();

        for (Ticket ticket : listTicket) {
            TicketDto ticketDto = new TicketDto(ticket);
            listTicketDto.add(ticketDto);
        }

        return listTicketDto;
    }

    /**
     * Update or create a ticket
     * @param ticketDto
     */
    public void updateOrCreate(TicketDto ticketDto) {
        Ticket ticket = new Ticket(ticketDto);
        ticketDaoImpl.update(ticket);
    }

    /**
     * Delete a ticket by id
     * @param id
     */
    public void delete(int id) throws DatabaseException {

        Ticket ticket = ticketDaoImpl.readOne(id);
        if (ticket != null) {
            ticketDaoImpl.delete(id);
        } else {
            throw new DatabaseException("The ID doesn't exists!");
        }

    }
}