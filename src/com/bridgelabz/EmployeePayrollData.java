package com.bridgelabz;

public class EmployeePayrollData {

    //declare variables
    int id;
    String name;
    double salary;

    //Create parameterized constructor using id, name, salary parameter
    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {//returns the string representation of the object
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}