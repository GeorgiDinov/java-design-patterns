package com.georgidinov;

public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer("Georgi", 100, "Pro Developer");
        Employee dev2 = new Developer("Mariya", 101, "Entry Level");

        Manager engManager = new Manager("Mike", 25000d);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer("Ivan", 200, "Developer");

        Manager generalManager = new Manager("Mark", 50000d);
        generalManager.addEmployee(dev3);

        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();




    }//end of main method

}//end of class Company
