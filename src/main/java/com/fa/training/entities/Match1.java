package com.fa.training.entities;

import com.fa.training.dto.Match1Dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "match1")
public class Match1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "match1_id", nullable = false)
    private int match1Id;

    @Column(name = "result")
    private String result;

    @Column(name = "in_on_air")
    private boolean isOnAir;

    @Column(name = "price")
    private double price;

    @Column(name = "start_at")
    private LocalDate startAt;

    @Column(name = "end_at")
    private LocalDate endAt;

    @Column(name = "opponent_team")
    private String opponentTeam;

    @Column(name = "stadium")
    private String stadium;

    @Column(name = "number_of_ticket")
    private int numberOfTicket;

    @Column(name = "number_of_ticket_sold")
    private int numberOfTicketSold;

    @OneToMany(mappedBy = "match1", cascade = CascadeType.ALL)
    private Set<Ticket> listTicket = new HashSet<Ticket>();

    public Match1() {

    }

    public Match1(String result, boolean isOnAir, double price, LocalDate startAt, LocalDate endAt, String opponentTeam,
                  String stadium, int numberOfTicket, int numberOfTicketSold) {
        super();
        this.result = result;
        this.isOnAir = isOnAir;
        this.price = price;
        this.startAt = startAt;
        this.endAt = endAt;
        this.opponentTeam = opponentTeam;
        this.stadium = stadium;
        this.numberOfTicket = numberOfTicket;
        this.numberOfTicketSold = numberOfTicketSold;
    }

    public Match1(Match1Dto match1Dto) {
        this.startAt = match1Dto.getStartAt();
        this.endAt = match1Dto.getEndAt();
        this.price = match1Dto.getPrice();
        this.isOnAir = match1Dto.isOnAir();
        this.result = match1Dto.getResult();
        this.opponentTeam = match1Dto.getOpponentTeam();
        this.stadium = match1Dto.getStadium();
        this.numberOfTicket = match1Dto.getNumberOfTicket();
        this.numberOfTicketSold = match1Dto.getNumberOfTicketSold();

    }

    public int getMatch1Id() {
        return match1Id;
    }

    public void setMatch1Id(int match1Id) {
        this.match1Id = match1Id;
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
        return "Match1{" +
                "match1Id=" + match1Id +
                ", result='" + result + '\'' +
                ", isOnAir=" + isOnAir +
                ", price=" + price +
                ", startAt=" + startAt +
                ", endAt=" + endAt +
                ", opponentTeam='" + opponentTeam + '\'' +
                ", stadium='" + stadium + '\'' +
                ", numberOfTicket=" + numberOfTicket +
                ", numberOfTicketSold=" + numberOfTicketSold +
                '}';
    }
}
