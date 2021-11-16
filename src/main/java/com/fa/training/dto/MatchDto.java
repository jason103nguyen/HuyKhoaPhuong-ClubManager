package com.fa.training.dto;

import com.fa.training.entities.Match;

import java.time.LocalDate;

public class MatchDto {

    private int matchId;
    private double price;
    private LocalDate startAt;
    private LocalDate endAt;
    private String result;
    private boolean isOnAir;
    private String opponentTeam;
    private String stadium;
    private int numberOfTicket;
    private int numberOfTicketSold;

    public MatchDto() {

    }

    public MatchDto(double price, LocalDate startAt, LocalDate endAt, String result, boolean isOnAir,
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


    public MatchDto(Match match) {
        this.price = match.getPrice();
        this.startAt = match.getStartAt();
        this.endAt = match.getEndAt();
        this.isOnAir = match.isOnAir();
        this.result = match.getResult();
        this.opponentTeam = match.getOpponentTeam();
        this.stadium = match.getStadium();
        this.numberOfTicket = match.getNumberOfTicket();
        this.numberOfTicketSold = match.getNumberOfTicketSold();
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
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
        return "MatchDto{" +
                "matchId=" + matchId +
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

