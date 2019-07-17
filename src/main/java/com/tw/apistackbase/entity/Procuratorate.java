package com.tw.apistackbase.entity;

import javax.persistence.*;
import java.util.List;

public class Procuratorate {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true,length = 50)
    private String name;

    @OneToMany
    @JoinColumn(name = "procuratorate_id")
    private List<Case> cases;

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

    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }
}
