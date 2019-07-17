package com.tw.apistackbase.entity;

import javax.persistence.*;

@Entity
@Table(name = "case_composition")
public class CaseComposition {

    @Id
    @GeneratedValue
    private int id;

    private String objectiveDescription;
    private String subjectiveDescription;

    @OneToOne
    @JoinColumn(name = "composition_id")
    private Case mycase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjectiveDescription() {
        return objectiveDescription;
    }

    public void setObjectiveDescription(String objectiveDescription) {
        this.objectiveDescription = objectiveDescription;
    }

    public String getSubjectiveDescription() {
        return subjectiveDescription;
    }

    public void setSubjectiveDescription(String subjectiveDescription) {
        this.subjectiveDescription = subjectiveDescription;
    }

    public Case getMycase() {
        return mycase;
    }

    public void setMycase(Case mycase) {
        this.mycase = mycase;
    }
}
