package com.fa.training.dao;

import com.fa.training.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TicketDaoImpl extends AbstractDao<Ticket> {

    @Autowired
    public TicketDaoImpl(LocalSessionFactoryBean localSessionFactoryBean) {
        super(Ticket.class, localSessionFactoryBean);
    }
}