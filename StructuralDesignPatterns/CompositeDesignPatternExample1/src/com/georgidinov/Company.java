package com.georgidinov;

public class Company {

    public static void main(String[] args) {
        Employee dev1 = new Developer("Georgi", 100, "Pro Developer");
        Employee dev2 = new Developer("Mariya", 101, "Entry Level");

        Directory engineerDirectory = new Directory();
        engineerDirectory.addEmployee(dev1);
        engineerDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Ivan", 200, "Ceo Manager");
        Employee man2 = new Manager("Petar", 201, "Mariya Manager");
        Directory accountingDirectory = new Directory();
        accountingDirectory.addEmployee(man1);
        accountingDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engineerDirectory);
        companyDirectory.addEmployee(accountingDirectory);

        companyDirectory.showEmployeeDetails();


    }//end of main method

}//end of class Company
