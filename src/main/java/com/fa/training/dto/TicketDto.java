package com.fa.training.dto;

import com.fa.training.entities.Ticket;

public class TicketDto {

    private int ticketId;
    private MatchDto matchDto;
    private double price;

    public TicketDto() {
    }

    public TicketDto(MatchDto matchDto, double price) {
        super();
        this.matchDto = matchDto;
        this.price = price;
    }

    public TicketDto(Ticket ticket) {
        MatchDto matchDto = new MatchDto(ticket.getMatch());
        this.matchDto = matchDto;
        this.price = ticket.getPrice();
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public MatchDto getMatchDto() {
        return matchDto;
    }

    public void setMatchDto(MatchDto matchDto) {
        this.matchDto = matchDto;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketDto{" +
                "ticketId=" + ticketId +
                ", matchDto=" + matchDto +
                ", price=" + price +
                '}';
    }
}


