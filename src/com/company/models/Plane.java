package com.company.models;

import java.util.List;

public class Plane {
    private int id;
    private String model;
    private int capacity;
    private List<Seat> seats;

    public Plane(int id, String model, int capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
    }


    public Plane() {

    }
}

class Seat {
    private long id;
    private String type;
}