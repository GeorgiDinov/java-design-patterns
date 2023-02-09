package com.georgidinov;

import java.util.ArrayList;
import java.util.List;

//composite class
class Supervisor implements Faculty {
    private String supervisorName;
    private String departmentName;
    private List<Faculty> facultyList;

    public Supervisor(String supervisorName, String departmentName) {
        this.supervisorName = supervisorName;
        this.departmentName = departmentName;
        this.facultyList = new ArrayList<>();
    }//end of constructor

    public String getSupervisorName() {
        return supervisorName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Faculty> getMyFaculties() {
        return facultyList;
    }

    public void add(Faculty faculty) {
        this.facultyList.add(faculty);
    }//end of method add

    public Faculty remove(Faculty faculty) {
        int index = findFaculty(faculty);
        if (index == -1) {
            return null;
        }
        return this.facultyList.remove(index);
    }//end of method remove with object

    public Faculty remove(int facultyIndex) {
        if (facultyIndex < 0) {
            return null;
        }
        return this.facultyList.remove(facultyIndex);
    }//end of overloaded method remove with index


    @Override
    public String getDetails() {
        return this.supervisorName + " is the " + this.departmentName;
    }

    private int findFaculty(Faculty faculty) {
        if (faculty != null) {
            for (int i = 0; i < this.facultyList.size(); i++) {
                if (faculty.getDetails().equals(this.facultyList.get(i).getDetails())) {
                    return i;
                }
            }
        }
        return -1;
    }//end of method findFaculty


}//end of composite class Supervisor
