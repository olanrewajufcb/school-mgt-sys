package com.sman.company;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private Courses courses;
    private List<ClassRooms> classRoomAssigned = new ArrayList<>();
    private Student student;

    public Teacher(String name) {
        super(name);
       this.courses = new Courses(courses.getCourseId(), courses.getCourseName(), courses.getCourseTeacher());

    }

    public Courses getCourses() {
        return courses;
    }

    public Student getStudent() {
        return student;
    }

    public List<ClassRooms> getClassRoomAssigned() {
        return classRoomAssigned;
    }

    @Override
    public void teach() {
        System.out.println("I teach in school");
    }

    public void motivate(){
        System.out.println("Teacher can motivate students");
    }

    public void motivate(Student student){     // method overloading
        System.out.println("The teacher motivate " + student + " to work harder.");
    }

}
