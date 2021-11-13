package com.fa.training.entities;

import com.fa.training.dto.FootballPlayerDto;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "football_player")
public class FootballPlayer {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                    @Parameter(
                            name = "uuid_gen_strategy_class",
                            value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                    )
            }
    )
    @Column(name = "fp_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "fp_name")
    private String name;

    @Column(name = "fp_salary")
    private double salary;

    @Column(name = "fp_start_of_contract")
    private LocalDate startOfContract;

    @Column(name = "fp_end_of_contract")
    private LocalDate endOfContract;

    @Column(name = "fp_number")
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

    public FootballPlayer(FootballPlayerDto footballPlayerDto) {
        this.name = footballPlayerDto.getName();
        this.salary = footballPlayerDto.getSalary();
        this.startOfContract = footballPlayerDto.getStartOfContract();
        this.endOfContract = footballPlayerDto.getEndOfContract();
        this.number = footballPlayerDto.getNumber();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
