package com.example.company_service.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {

    @Id
    @Column(nullable = false, unique = true)
    private String shortId;

    @Column(nullable = false)
    private String name;

    @Column(name = "no_of_share")
    private int noOfShare;

    @Column(nullable = false)
    private double price;

    public Company() {
    }

    public Company(String shortID, String name, int noOfShare, double price) {
        this.shortID = shortID;
        this.name = name;
        this.noOfShare = noOfShare;
        this.price = price;
    }

    public String getShortID() {
        return shortID;
    }

    public void setShortID(String shortID) {
        this.shortID = shortID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
