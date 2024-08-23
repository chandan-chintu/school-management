package com.simpleproject.school_management.model;

public class Course {

    private int courseId;
    private String courseName;
    private int marks;

    public Course(int courseId, String courseName, int marks) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.marks = marks;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
