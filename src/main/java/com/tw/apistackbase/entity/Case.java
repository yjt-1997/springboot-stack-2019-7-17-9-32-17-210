package com.tw.apistackbase.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "case")
public class Case {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Calendar happenedTime;

    public Case() {
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

    public Calendar getHappenedTime() {
        return happenedTime;
    }

    public void setHappenedTime(Calendar happenedTime) {
        this.happenedTime = happenedTime;
    }
}
