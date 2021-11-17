package com.fa.training.entities;

import com.fa.training.dto.TicketDto;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id", nullable = false)
    private int ticketId;

    @ManyToOne
    @JoinColumn(name = "match_id", referencedColumnName = "match_id")
    private Match match;

    @Column(name = "price")
    private double price;

    public Ticket() {
    }

    public Ticket(Match match, double price) {
        this.match = match;
        this.price = price;
    }

    public Ticket(TicketDto ticketDto) {
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", match=" + match +
                ", price=" + price +
                '}';
    }
}