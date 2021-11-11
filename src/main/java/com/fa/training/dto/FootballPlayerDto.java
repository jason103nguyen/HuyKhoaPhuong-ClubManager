package com.fa.training.dto;

import com.fa.training.entities.FootballPlayer;

import java.time.LocalDate;

public class FootballPlayerDto {

    private int id;
    private String name;
    private double salary;
    private LocalDate startOfContract;
    private LocalDate endOfContract;
    private String number;

    public FootballPlayerDto() {
    }

    public FootballPlayerDto(String name, double salary, LocalDate startOfContract, LocalDate endOfContract, String number) {
        this.name = name;
        this.salary = salary;
        this.startOfContract = startOfContract;
        this.endOfContract = endOfContract;
        this.number = number;
    }

    public FootballPlayerDto(FootballPlayer footballPlayer) {
        this.name = footballPlayer.getName();
        this.salary = footballPlayer.getSalary();
        this.startOfContract = footballPlayer.getStartOfContract();
        this.endOfContract = footballPlayer.getEndOfContract();
        this.number = footballPlayer.getNumber();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getStartOfContract() {
        return startOfContract;
    }

    public void setStartOfContract(LocalDate startOfContract) {
        this.startOfContract = startOfContract;
    }

    public LocalDate getEndOfContract() {
        return endOfContract;
    }

    public void setEndOfContract(LocalDate endOfContract) {
        this.endOfContract = endOfContract;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FootballPlayerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", startOfContract=" + startOfContract +
                ", endOfContract=" + endOfContract +
                ", number='" + number + '\'' +
                '}';
    }
}
