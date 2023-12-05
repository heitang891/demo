package com.example.demo.model;

import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private String grade;
    private String major;
    private String college;
    private List<String> selectedCourses;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public List<String> getSelectedCourses() {
        return selectedCourses;
    }

    public void setSelectedCourses(List<String> selectedCourses) {
        this.selectedCourses = selectedCourses;
    }
}
