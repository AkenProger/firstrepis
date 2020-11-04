package com.company;

import com.company.enums.EmployeStatus;
import com.company.services.EmployeService;
import com.company.services.impl.EmployeServiceImpl;

public class Main {

    public static void main(String[] args) {
        EmployeService.INTANSE.changeEmployeStatus((long) 12, EmployeStatus.DECRET);
    }
}
