package com.example.testproject;

import java.util.Date;

public class Student {

    private int id;

    private Date dateOfBirth;

    private String studentName;

    private String major;

    private float gpa;

    public Student(){}

    public Student(int id, Date dateOfBirth, String studentName, String major, float gpa) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.major = major;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMajor() {
        return major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

