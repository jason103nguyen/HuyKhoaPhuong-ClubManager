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

    @ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "match_id")
    private Match1 match1;

    @Column(name = "price")
    private double price;

    public Ticket() {

    }

    public Ticket(Match1 match1, double price) {
        this.match1 = match1;
        this.price = price;
    }

    public Ticket(TicketDto ticketDto) {
        this.price = ticketDto.getPrice();
        this.match1 = new Match1(ticketDto.getMatchIDto());
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Match1 getMatch() {
        return match1;
    }

    public void setMatch(Match1 match1) {
        this.match1 = match1;
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
                ", match=" + match1 +
                ", price=" + price +
                '}';
    }
}