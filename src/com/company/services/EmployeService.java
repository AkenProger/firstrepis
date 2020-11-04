package com.company.services;

import com.company.enums.EmployeStatus;
import com.company.models.Employee;
import com.company.services.impl.EmployeServiceImpl;

public interface EmployeService {
    EmployeService INTANSE = new EmployeServiceImpl();

    boolean saveEmployee(Employee employee);

    Employee findEmployeById(Long id);

    boolean changeEmployeStatus(Long id, EmployeStatus newStatus);


}
