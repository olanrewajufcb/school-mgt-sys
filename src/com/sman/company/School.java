package com.sman.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School {

    private static List<Student> students = new ArrayList<>();
    private static List<Staff> staff = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();


    private Principal principal;
    private String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void getStudentsName(){
        Iterator i = students.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }

}
