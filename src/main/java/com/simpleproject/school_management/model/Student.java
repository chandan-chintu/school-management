package com.simpleproject.school_management.model;

public class Student {

    private int studentId;
    private String name;
    private String dob;
    private String grade;
    private String section;

    public Student(int studentId, String name, String dob, String grade, String section) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.grade = grade;
        this.section = section;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    // toString() - generates the output in the same format (displaying the output)
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", grade='" + grade + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
