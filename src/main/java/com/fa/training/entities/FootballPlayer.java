package com.fa.training.entities;

import com.fa.training.dto.FootballPlayerDto;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name = "football_player")
public class FootballPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fp_id", updatable = false, nullable = false)
    private int id;

    @Column(name = "fp_name")
    @NotBlank(message = "{footballPlayer.name.Invalid}")
    private String name;

    @Column(name = "fp_salary")
    @Min(value = 0, message = "{footballPlayer.salary.Invalid}")
    private double salary;

    @Column(name = "fp_start_of_contract")
    private LocalDate startOfContract;

    @Column(name = "fp_end_of_contract")
    private LocalDate endOfContract;

    @Column(name = "fp_number", unique = true)
    @Length(min = 1, max = 3, message = "{footballPlayer.numberOfShirt.Invalid}")
    private String numberOfShirt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "footballPlayer")
    private Set<AdvertisingContract> advertisingContracts;

    public FootballPlayer() {
    }

    public FootballPlayer(String name, double salary, LocalDate startOfContract, LocalDate endOfContract, String numberOfShirt) {
        this.name = name;
        this.salary = salary;
        this.startOfContract = startOfContract;
        this.endOfContract = endOfContract;
        this.numberOfShirt = numberOfShirt;
    }

    public FootballPlayer(FootballPlayerDto footballPlayerDto) {
        this.id = footballPlayerDto.getId();
        this.name = footballPlayerDto.getName();
        this.salary = footballPlayerDto.getSalary();
        this.startOfContract = footballPlayerDto.getStartOfContract();
        this.endOfContract = footballPlayerDto.getEndOfContract();
        this.numberOfShirt = footballPlayerDto.getNumber();
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
        return numberOfShirt;
    }

    public void setNumber(String numberOfShirt) {
        this.numberOfShirt = numberOfShirt;
    }

    public Set<AdvertisingContract> getAdvertisingContracts() {
        return advertisingContracts;
    }

    public void setAdvertisingContracts(Set<AdvertisingContract> advertisingContracts) {
        this.advertisingContracts = advertisingContracts;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", startOfContract=" + startOfContract +
                ", endOfContract=" + endOfContract +
                ", numberOfShirt='" + numberOfShirt + '\'' +
                ", advertisingContracts='" + advertisingContracts + '\'' +
                '}';
    }
}
