package com.fa.training.entities;

import java.time.LocalDate;

public class FootballPlayer {

    private int id;
    private String name;
    private double salary;
    private LocalDate startOfContract;
    private LocalDate endOfContract;
    private String number;

    public FootballPlayer() {
    }

    public FootballPlayer(String name, double salary, LocalDate startOfContract, LocalDate endOfContract, String number) {
        this.name = name;
        this.salary = salary;
        this.startOfContract = startOfContract;
        this.endOfContract = endOfContract;
        this.number = number;
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
        return "FootballPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", startOfContract=" + startOfContract +
                ", endOfContract=" + endOfContract +
                ", number='" + number + '\'' +
                '}';
    }
}
