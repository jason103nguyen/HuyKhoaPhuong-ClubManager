package com.fa.training.dto;

import com.fa.training.entities.Match;
import com.fa.training.entities.Ticket;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class MatchDto {

    private int id;
    private String opponentTeam;
    private LocalDate startAt;
    private LocalDate endAt;
    private String result;
    private boolean isOnAir;
    private String stadium;
    private int numberOfTicket;
    private int numberOfTicketSold;
    private Set<Ticket> tickets = new HashSet<Ticket>();

    public MatchDto(){
    }

    public MatchDto(String opponentTeam, LocalDate startAt, LocalDate endAt,
                    String result, boolean isOnAir, String stadium, int numberOfTicket,
                    int numberOfTicketSold, Set<Ticket> tickets) {
        this.opponentTeam = opponentTeam;
        this.startAt = startAt;
        this.endAt = endAt;
        this.result = result;
        this.isOnAir = isOnAir;
        this.stadium = stadium;
        this.numberOfTicket = numberOfTicket;
        this.numberOfTicketSold = numberOfTicketSold;
        this.tickets = tickets;
    }

    public MatchDto(Match match) {
        this.id = match.getId();
        this.opponentTeam = match.getOpponentTeam();
        this.startAt = match.getStartAt();
        this.endAt = match.getEndAt();
        this.result = match.getResult();
        this.isOnAir = match.isOnAir();
        this.stadium = match.getStadium();
        this.numberOfTicket = match.getNumberOfTicket();
        this.numberOfTicketSold = match.getNumberOfTicketSold();
        this.tickets = match.getTickets();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpponentTeam() {
        return opponentTeam;
    }

    public void setOpponentTeam(String opponentTeam) {
        this.opponentTeam = opponentTeam;
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

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "MatchDto{" +
                "id=" + id +
                ", opponentTeam='" + opponentTeam + '\'' +
                ", startAt=" + startAt +
                ", endAt=" + endAt +
                ", result='" + result + '\'' +
                ", isOnAir=" + isOnAir +
                ", stadium='" + stadium + '\'' +
                ", numberOfTicket=" + numberOfTicket +
                ", numberOfTicketSold=" + numberOfTicketSold +
                ", tickets=" + tickets +
                '}';
    }
}

