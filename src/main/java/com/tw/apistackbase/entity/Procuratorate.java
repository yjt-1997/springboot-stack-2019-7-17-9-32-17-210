package com.tw.apistackbase.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "procuratorate")
public class Procuratorate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,length = 50)
    private String name;


    @OneToMany
    @JoinColumn(name = "procuratorate_id", referencedColumnName = "id")
    private List<Inquisitor> inquisitors;

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

    public List<Inquisitor> getInquisitors() {
        return inquisitors;
    }

    public void setInquisitors(List<Inquisitor> inquisitors) {
        this.inquisitors = inquisitors;
    }
}
