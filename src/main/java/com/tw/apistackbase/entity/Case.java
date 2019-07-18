package com.tw.apistackbase.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "case")
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private long happenedTime;

    @OneToOne
    @JoinColumn(name = "composition_id")
    private CaseComposition caseComposition;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "procuratorate_id", referencedColumnName = "id")
    private Procuratorate procuratorate;

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

    public long getHappenedTime() {
        return happenedTime;
    }

    public void setHappenedTime(long happenedTime) {
        this.happenedTime = happenedTime;
    }

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }

    public CaseComposition getCaseComposition() {
        return caseComposition;
    }

    public void setCaseComposition(CaseComposition caseComposition) {
        this.caseComposition = caseComposition;
    }
}
