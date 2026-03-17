package com.example.company_service.dto;

public class CompanyDTO {

    private String shortID;
    private String name;
    private int noOfShare;
    private double price;

    // Default Constructor
    public CompanyDTO() {
    }

    // Parameterized Constructor
    public CompanyDTO(String shortID, String name, int noOfShare, double price) {
        this.shortID = shortID;
        this.name = name;
        this.noOfShare = noOfShare;
        this.price = price;
    }

    // Getters & Setters
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
