package com.tw.apistackbase.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "case_composition")
public class CaseComposition {

    @Id
    @GeneratedValue
    private int id;

    private String objectiveDescription;
    private String subjectiveDescription;

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
}
