package com.company;

import com.company.enums.EmployeStatus;
import com.company.enums.FlightStatus;
import com.company.models.*;
import com.company.services.EmployeService;
import com.company.services.FlightService;
import com.company.services.impl.EmployeServiceImpl;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
       /* EmployeStatus[] employeStatuses =  EmployeStatus.values();
        for (EmployeStatus employeStatus: employeStatuses) {
            System.out.println(employeStatus);
        }
         EmployeStatus employeStatus = EmployeStatus.valueOf("ACTIVE");
        */
        EmployeService.INTANSE.changeEmployeStatus((long) 12, EmployeStatus.VACATION);
        Plane plane = new Plane(1,"AN-502",25);
        Flight flight = new Flight(1,new Date(12-12-2020),new Date(15-12-2020),new City(1,"Бишкек"), new City(2,"Ош"), plane, FlightStatus.CANCELED);
        FlightService.INSTANSE_FLIGHT.StatusChanger(flight);



    }
}
