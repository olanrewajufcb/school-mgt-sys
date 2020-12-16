package com.sman.company;

public class Courses {
    private String courseId;
    private String courseName;
    private String courseTeacher;

    public Courses(String courseId, String courseName, String courseTeacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
    }

    public String getCourseId() {
        return courseId;
    }



    public String getCourseName() {
        return courseName;
    }


    public String getCourseTeacher() {
        return courseTeacher;
    }


}
