package com.fa.training.service;

import com.fa.training.dao.TicketDaoImpl;
import com.fa.training.dto.TicketDto;
import com.fa.training.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements ITicketService {

    @Autowired
    private TicketDaoImpl ticketDaoImpl;

    public TicketServiceImpl(TicketDaoImpl ticketDaoImpl) {
        this.ticketDaoImpl = ticketDaoImpl;
    }

    @Override
    public void create(TicketDto ticketDto) {
        Ticket ticket = new Ticket(ticketDto);
        ticketDaoImpl.create(ticket);
    }

}
