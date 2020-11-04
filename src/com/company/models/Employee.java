package com.company.models;

import com.company.enums.EmployeStatus;

public class Employee {
    public static String companyName = "MegaCom";
    private long id;
    private String name;
    private Account account;
    private EmployeStatus employeStatus;

    public Employee(long id, String name,EmployeStatus employeStatus) {
        this.id = id;
        this.name = name;
        this.employeStatus =employeStatus;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
class Account {
    private String name;
    private String password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
