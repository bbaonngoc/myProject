package com.example.testproject;

import java.time.LocalDate;
import java.util.Date;

public class Student {

    private int id;

    private LocalDate dateOfBirth;

    private String studentName;

    private String major;

    private float gpa;

    public Student(){}

    public Student(int id, LocalDate dateOfBirth, String studentName, String major, float gpa) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.major = major;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

