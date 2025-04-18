package com.example.Course.Registration.System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course
{
    @Id
    private String courseId;
    private String courseName;
    private String courseTrainer;
    private int courseDurationInWeek;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTrainer() {
        return courseTrainer;
    }

    public void setCourseTrainer(String courseTrainer) {
        this.courseTrainer = courseTrainer;
    }

    public int getCourseDurationInWeek() {
        return courseDurationInWeek;
    }

    public void setCourseDurationInWeek(int courseDurationInWeek) {
        this.courseDurationInWeek = courseDurationInWeek;
    }
}
