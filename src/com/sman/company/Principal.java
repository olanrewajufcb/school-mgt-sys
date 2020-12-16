package com.sman.company;

import java.util.List;

public class Principal extends Staff{
    private Student student ;
    private School school;
    private Teacher teacher;
    private ClassRooms classRoom;

//    School school =
    public Principal(String name, int age, String post, Boolean isAcamedicStaff, String schoolName, Student student) {
        super(name, age, post, isAcamedicStaff, schoolName);
        this.student = student;
        this.school = new School(schoolName);
    }



    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void advise() {
        super.advise();
        System.out.println("Principal is responsible for ensuring that students behave well at school");
    }



    public Student getStudent() {
        return student;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public Teacher getTeacher(){
        return  teacher;
    }

    @Override
    public String getSchoolName() {
        return super.getSchoolName();
    }


    // principal can expel a student by calling this method
    public void suspend(Student student) {
        school.getStudents().remove(student);
    }


    // The principal can admit new student by calling this method
    public void admitStudent(Student student){
        school.getStudents().add(student);
    }


    public void assignCourseToTeacher(Courses course){
        teacher.getCourseTaught().add(course);
    }

    public void assignClassRoomToTeacher(ClassRooms classRoom){
        teacher.getClassRoomAssigned().add(classRoom);
    }
}
