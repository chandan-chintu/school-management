package com.simpleproject.school_management.model;

public class Teacher {

    private int teacherId;
    private String name;
    private String email;
    private String mobile;
    private String qualification;
    private String courseName;

    public Teacher(int teacherId, String name, String email, String mobile, String qualification, String courseName) {
        this.teacherId = teacherId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.qualification = qualification;
        this.courseName = courseName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", qualification='" + qualification + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
