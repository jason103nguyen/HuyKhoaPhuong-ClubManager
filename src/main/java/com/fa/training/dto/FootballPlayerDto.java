package com.fa.training.dto;

import com.fa.training.entities.FootballPlayer;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class FootballPlayerDto {

    private int id;
    private String name;
    private double salary;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate startOfContract;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate endOfContract;
    private String numberOfShirt;

    public FootballPlayerDto() {
    }

    public FootballPlayerDto(String name, double salary, LocalDate startOfContract, LocalDate endOfContract, String numberOfShirt) {
        this.name = name;
        this.salary = salary;
        this.startOfContract = startOfContract;
        this.endOfContract = endOfContract;
        this.numberOfShirt = numberOfShirt;
    }

    public FootballPlayerDto(FootballPlayer footballPlayer) {
        this.id = footballPlayer.getId();
        this.name = footballPlayer.getName();
        this.salary = footballPlayer.getSalary();
        this.startOfContract = footballPlayer.getStartOfContract();
        this.endOfContract = footballPlayer.getEndOfContract();
        this.numberOfShirt = footballPlayer.getNumberOfShirt();
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

    public String getNumberOfShirt() {
        return numberOfShirt;
    }

    public void setNumberOfShirt(String numberOfShirt) {
        this.numberOfShirt = numberOfShirt;
    }

    @Override
    public String toString() {
        return "FootballPlayerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", startOfContract=" + startOfContract +
                ", endOfContract=" + endOfContract +
                ", numberOfShirt='" + numberOfShirt + '\'' +
                '}';
    }
}
