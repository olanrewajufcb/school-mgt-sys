package com.sman.company;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private List<Courses> courseTaught = new ArrayList<>();
    private List<ClassRooms> classRoomAssigned = new ArrayList<>();
    private Student student;

    public List<Courses> getCourseTaught() {
        return courseTaught;
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
