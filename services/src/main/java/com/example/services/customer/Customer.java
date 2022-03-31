package com.example.services;

public class Customer {

    private final short id;
    private String firstName;
    private String lastName;

    public Customer(short id, String firstName, string lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public short getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}