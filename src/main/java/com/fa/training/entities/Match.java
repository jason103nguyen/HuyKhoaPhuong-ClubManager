package com.fa.training.entities;

import com.fa.training.dto.MatchDto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "match_id", nullable = false)
    private int id;

    @Column(name = "opponent_team")
    private String opponentTeam;

    @Column(name = "start_at")
    private LocalDate startAt;

    @Column(name = "end_at")
    private LocalDate endAt;

    @Column(name = "result")
    private String result;

    @Column(name = "in_on_air")
    private boolean isOnAir;

    @Column(name = "stadium")
    private String stadium;

    @Column(name = "number_of_ticket")
    private int numberOfTicket;

    @Column(name = "number_of_ticket_sold")
    private int numberOfTicketSold;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL)
    private Set<Ticket> tickets = new HashSet<Ticket>();

    public Match() {
    }

    public Match(int id, String opponentTeam, LocalDate startAt, LocalDate endAt, String result,
                 boolean isOnAir, String stadium, int numberOfTicket, int numberOfTicketSold,
                 Set<Ticket> tickets) {
        this.id = id;
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

    public Match(MatchDto matchDto) {
        this.id = matchDto.getId();
        this.opponentTeam = matchDto.getOpponentTeam();
        this.startAt = matchDto.getStartAt();
        this.endAt = matchDto.getEndAt();
        this.result = matchDto.getResult();
        this.isOnAir = matchDto.isOnAir();
        this.stadium = matchDto.getStadium();
        this.numberOfTicket = matchDto.getNumberOfTicket();
        this.numberOfTicketSold = matchDto.getNumberOfTicketSold();
        this.tickets = matchDto.getTickets();
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
        return "Match{" +
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
