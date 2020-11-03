package com.company.models;

public class Ticket {
    private int id;
    private double price;
    private boolean active;
    private Flight flight;
    private boolean isSold ;


    public Ticket(int id, double price, boolean active,  boolean isSold) {
        this.id = id;
        this.price = price;
        this.active = active;

        this.isSold = isSold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}
