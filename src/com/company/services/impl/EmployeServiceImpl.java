package com.company.services.impl;

import com.company.enums.EmployeStatus;
import com.company.models.Employee;
import com.company.services.EmployeService;

public class EmployeServiceImpl implements EmployeService {

    @Override
    public boolean saveEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee findEmployeById(Long id) {
        return new Employee(id, "Hanter", EmployeStatus.ACTIVE);
    }

    @Override
    public boolean changeEmployeStatus(Long id, EmployeStatus newStatus) {
        Employee employee = findEmployeById((long) 133);
        System.out.println(employee);
        return false;
    }


}
