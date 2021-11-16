package com.fa.training.dto;

import com.fa.training.entities.Match1;

import java.time.LocalDate;

public class Match1Dto {

    private int match1Id;
    private double price;
    private LocalDate startAt;
    private LocalDate endAt;
    private String result;
    private boolean isOnAir;
    private String opponentTeam;
    private String stadium;
    private int numberOfTicket;
    private int numberOfTicketSold;

    public Match1Dto() {

    }



    public Match1Dto(double price, LocalDate startAt, LocalDate endAt, String result, boolean isOnAir,
                     String opponentTeam, String stadium, int numberOfTicket, int numberOfTicketSold) {
        super();
        this.price = price;
        this.startAt = startAt;
        this.endAt = endAt;
        this.result = result;
        this.isOnAir = isOnAir;
        this.opponentTeam = opponentTeam;
        this.stadium = stadium;
        this.numberOfTicket = numberOfTicket;
        this.numberOfTicketSold = numberOfTicketSold;
    }



    public Match1Dto(Match1 match1) {
        this.price = match1.getPrice();
        this.startAt = match1.getStartAt();
        this.endAt = match1.getEndAt();
        this.isOnAir = match1.isOnAir();
        this.result = match1.getResult();
        this.opponentTeam = match1.getOpponentTeam();
        this.stadium = match1.getStadium();
        this.numberOfTicket = match1.getNumberOfTicket();
        this.numberOfTicketSold = match1.getNumberOfTicketSold();
    }

    public int getMatch1Id() {
        return match1Id;
    }

    public void setMatch1Id(int match1Id) {
        this.match1Id = match1Id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalDate startAt) {
        this.startAt = startAt;
    }

    public LocalDate getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDate endAt) {
        this.endAt = endAt;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isOnAir() {
        return isOnAir;
    }

    public void setOnAir(boolean onAir) {
        isOnAir = onAir;
    }

    public String getOpponentTeam() {
        return opponentTeam;
    }

    public void setOpponentTeam(String opponentTeam) {
        this.opponentTeam = opponentTeam;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public int getNumberOfTicketSold() {
        return numberOfTicketSold;
    }

    public void setNumberOfTicketSold(int numberOfTicketSold) {
        this.numberOfTicketSold = numberOfTicketSold;
    }

    @Override
    public String toString() {
        return "Match1Dto{" +
                "match1Id=" + match1Id +
                ", price=" + price +
                ", startAt=" + startAt +
                ", endAt=" + endAt +
                ", result='" + result + '\'' +
                ", isOnAir=" + isOnAir +
                ", opponentTeam='" + opponentTeam + '\'' +
                ", stadium='" + stadium + '\'' +
                ", numberOfTicket=" + numberOfTicket +
                ", numberOfTicketSold=" + numberOfTicketSold +
                '}';
    }
}

