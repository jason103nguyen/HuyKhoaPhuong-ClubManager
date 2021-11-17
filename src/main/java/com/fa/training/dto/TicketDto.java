package com.fa.training.dto;

import com.fa.training.entities.Ticket;

public class TicketDto {

    private int tickeId;
    private Match1Dto matchIDto;
    private double price;

    public TicketDto() {

    }

    public TicketDto(Match1Dto matchiDto, double price) {
        super();
        matchIDto = matchiDto;
        this.price = price;
    }

    public TicketDto(Ticket ticket) {

        this.matchIDto = new Match1Dto(ticket.getMatch());
        this.price = ticket.getPrice();
    }

    public int getTickeId() {
        return tickeId;
    }

    public void setTickeId(int tickeId) {
        this.tickeId = tickeId;
    }

    public Match1Dto getMatchIDto() {
        return matchIDto;
    }

    public void setMatch1IDto(Match1Dto matchiDto) {
        matchIDto = matchiDto;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketDto [tickeId=" + tickeId + ", matchIDto=" + matchIDto + ", price=" + price + "]";
    }

}


