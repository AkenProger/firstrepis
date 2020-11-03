package com.company.models;

import java.util.Date;

public class FlightCheckInService {

    public void CheckInService(Flight flight) {
        showMessageInt(flight.getId());
        showMessageDate(flight.getOutDate());
        showMessageDate(flight.getToDate());
        showMessage(flight.getFrom().getCityName());
        showMessage(flight.getTo().getCityName());

        showMessage(flight.getPassengers().get(1).getName());

    }


    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showMessageInt(int message) {
        System.out.println(message);
    }

    public void showMessageDate(Date message) {
        System.out.println(message);
    }
}
