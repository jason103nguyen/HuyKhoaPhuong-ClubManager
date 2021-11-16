package com.fa.training.dto;

import com.fa.training.entities.Ticket;

public class TicketDto {

    private int tickeId;
    private MatchDto matchIDto;
    private double price;

    public TicketDto() {

    }

    public TicketDto(MatchDto matchiDto, double price) {
        super();
        matchIDto = matchiDto;
        this.price = price;
    }

    public TicketDto(Ticket ticket) {

        this.matchIDto = new MatchDto(ticket.getMatch());
        this.price = ticket.getPrice();
    }

    public int getTickeId() {
        return tickeId;
    }

    public void setTickeId(int tickeId) {
        this.tickeId = tickeId;
    }

    public MatchDto getMatchIDto() {
        return matchIDto;
    }

    public void setMatch1IDto(MatchDto matchiDto) {
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


