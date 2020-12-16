package com.sman.company;

public class Student extends Person{
    private String studentId;
    private Courses courses; //Aggregation example courses relationship shared by both students and teacher
    private int score;
    private  String grade;
    private ClassRooms classRoom;


    public Student(String name, int age, String studentId, Courses courses, ClassRooms classRoom) {
        super(name, age);
        this.studentId = studentId;
        this.courses = courses;

        this.classRoom = classRoom;
    }

    public String takeTest(){
        return "I'm starting my test this week";
    }

    @Override
    public void teach() {
        System.out.println("I teach others what I know");
    }




    public String getStudentId() {
        return studentId;
    }

    public Courses getCourses() {
        return courses;
    }

    public String getName(){
        return super.getName();
    }

}
