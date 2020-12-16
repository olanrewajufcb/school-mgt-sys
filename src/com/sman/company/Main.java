package com.sman.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    School school = new School("MKC");
    Staff staff = new Staff("Ade", 33, "Admin", false, "MKC");
    Courses courses = new Courses("AD3", "English","Mr Ballard");
    ClassRooms classRoom =new ClassRooms("Primary 6");
    Student student = new Student("Mustopha",15,"AbN",courses,classRoom);
    Student student2 = new Student("Moses",15,"AbN12",courses,classRoom);
    Student student3 = new Student("Lateef",13,"AbN",courses,classRoom);
    Student student4 = new Student("Bilal",12,"A12N",courses,classRoom);
    Student student5 = new Student("Buhari",15,"AhbN",courses,classRoom);

    Principal principal = new Principal("Dr Badmus", 35, "Principal", false, "MKC", student);

        principal.admitStudent(student);
        principal.admitStudent(student2);
        principal.admitStudent(student3);
        principal.admitStudent(student4);
        principal.admitStudent(student5);

        principal.suspend(student2);
        System.out.println("Student 2 removed");

        System.out.println(school.getStudents().get(1).getName());
  System.out.println(school.getStudents().get(1).getStudentId());




    }
}
