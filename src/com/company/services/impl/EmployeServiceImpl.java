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
        return new Employee(id, "Hanter", EmployeStatus.DECRET);
    }

    @Override
    public boolean changeEmployeStatus(Long id, EmployeStatus newStatus) {
        Employee employee = findEmployeById((long) 133);
        System.out.println(employee.getEmployeStatus());
        if (employee.getEmployeStatus().equals(EmployeStatus.FIRED) && newStatus.equals(EmployeStatus.VACATION)) {
            System.out.println("Нельзя отправить в отпуск уволенного человека!");
        } else if (employee.getEmployeStatus().equals(EmployeStatus.DECRET) && newStatus.equals(EmployeStatus.FIRED)) {
            System.out.println("Нельзя уволить человека в декрете!");
        }
        employee.setEmployeStatus(newStatus);
        System.out.println(employee.getEmployeStatus());


        return false;
    }


}
