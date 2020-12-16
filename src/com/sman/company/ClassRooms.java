package com.sman.company;

import java.util.ArrayList;
import java.util.List;

public class ClassRooms {
    private String teacher;
    private List<Student> students = new ArrayList<>();
    private String className;
    private List<Courses> courses = new ArrayList<>();

    public ClassRooms(String className) {
        this.className = className;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }


    // adding new subjects for a class
    public List<Courses> getCourses() {
        return courses;
    }


}
