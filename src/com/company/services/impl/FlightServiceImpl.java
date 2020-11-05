package com.company.services.impl;

import com.company.enums.FlightStatus;
import com.company.models.Flight;
import com.company.models.Plane;
import com.company.services.FlightService;

public class FlightServiceImpl implements FlightService {


    @Override
    public void StatusChanger(Flight flight) {
       if (flight.getFlightStatus().equals(FlightStatus.CANCELED)) {
           System.out.println("Рейс от "+ flight.getFrom().getCityName() + " на "+flight.getTo().getCityName()+" отменен");
           System.out.println(flight.getOutDate());
           System.out.println(flight.getToDate());
           System.out.println("Модель самолета "+ flight.getPlane().getModel());
       }else {
           System.out.println("ERROR");
       }

    }
}
