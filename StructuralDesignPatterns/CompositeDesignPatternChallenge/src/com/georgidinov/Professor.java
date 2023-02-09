package com.georgidinov;

//leaf component
class Professor implements Faculty {

    private String name;
    private String position;
    private String officeNumber;

    public Professor(String name, String position, String officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }//end of constructor

    @Override
    public String getDetails() {
        return "Name: " + this.name +
                ", Position: " + this.position +
                ", Phone number: " + this.officeNumber;
    }//end of method getDetails

}//end of leaf class Professor
