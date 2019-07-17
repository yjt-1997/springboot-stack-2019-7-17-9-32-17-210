package com.tw.apistackbase.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Procuratorate {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true,length = 50)
    private String name;
}
