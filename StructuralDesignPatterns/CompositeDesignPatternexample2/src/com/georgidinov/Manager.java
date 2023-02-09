package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private List<Employee> employeeList = new ArrayList<>();
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }//end of constructor

    public Employee getChild(int i) {
        return this.employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("\n<manager>");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + String.format("%.2f", this.salary));
        System.out.println(this.name + " employees: ");
        this.employeeList.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employeeList.remove(employee);
    }

}//end of class Directory
