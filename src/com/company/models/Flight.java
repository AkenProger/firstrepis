package com.company.models;

import java.util.Date;
import java.util.List;

/*
Описание
Поведение то что обьект сделает

* */
public class Flight {
    private int id;
    private Date outDate;
    private Date toDate;
    private City from;
    private City to;
    private Plane plane;
    private List<Passenger> passengers;
    public static int count;

    public static void PrintCount() {
        System.out.println(count);
    }

    public Flight() {

    }

    /*  public Flight(int id, Date outDate, Date toDate, City from, City to, Plane plane, List<Passenger> passengers) {
            this.id = id;
            this.outDate = outDate;
            this.toDate = toDate;
            this.from = from;
            this.to = to;
            this.plane = plane;
            this.passengers = passengers;
        }
    */
    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public City getFrom() {
        return from;
    }

    public void setFrom(City from) {
        this.from = from;
    }

    public City getTo() {
        return to;
    }

    public void setTo(City to) {
        this.to = to;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
