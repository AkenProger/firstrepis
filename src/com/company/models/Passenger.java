package com.company.models;

public class Passenger {
    private int id;
    private String name;
    private String phone;
    private Ticket ticket;
    private Wallet wallet;


    public Passenger(int id, String name, String phone, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.wallet =wallet;

    }

    public Passenger() {

    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
 class Wallet {
    private double passengerWalletSize;

     public Wallet(int passengerWalletSize) {
         this.passengerWalletSize = passengerWalletSize;
     }

     public double getPassengerWalletSize() {
         return passengerWalletSize;
     }

     public void setPassengerWalletSize(double passengerWalletSize) {
         this.passengerWalletSize = passengerWalletSize;
     }
 }
