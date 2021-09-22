package com.perasgal.farmback.model;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "cow")
@Entity
public class Cow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "birth_date", nullable = false)
    private Instant birthDate;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "births_count")
    private Integer birthsCount;

    @Column(name = "dry_date")
    private Instant dryDate;

    @Column(name = "death_date")
    private Instant deathDate;

    @Column(name = "milking_date")
    private Instant milkingDate;

    @Column(name = "pin_number", length = 30)
    private String pinNumber;

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public Instant getMilkingDate() {
        return milkingDate;
    }

    public void setMilkingDate(Instant milkingDate) {
        this.milkingDate = milkingDate;
    }

    public Instant getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Instant deathDate) {
        this.deathDate = deathDate;
    }

    public Instant getDryDate() {
        return dryDate;
    }

    public void setDryDate(Instant dryDate) {
        this.dryDate = dryDate;
    }

    public Integer getBirthsCount() {
        return birthsCount;
    }

    public void setBirthsCount(Integer birthsCount) {
        this.birthsCount = birthsCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
