package com.company.services;

import com.company.enums.FlightStatus;
import com.company.models.Flight;
import com.company.services.impl.FlightServiceImpl;

public interface FlightService {

    FlightService INSTANSE_FLIGHT = new FlightServiceImpl();

    void StatusChanger(Flight flight);

}
