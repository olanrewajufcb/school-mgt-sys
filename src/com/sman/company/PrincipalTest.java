package com.sman.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrincipalTest {
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
    @Test
    public void suspend() {

    }

    @Test
    public void admitStudent() {

        principal.admitStudent(student);
        principal.admitStudent(student2);
        principal.admitStudent(student3);

        assertEquals("Mustopha",principal.admitStudent(student));
    }

    @Test
    public void assignCourseToTeacher() {
    }
}