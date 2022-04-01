package com.example.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    private @Id @GeneratedValue Short id;
    private String name;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    public Short getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}