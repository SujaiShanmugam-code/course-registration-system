package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistory;
import com.example.Course.Registration.System.repository.CourseRegistoryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService
{

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistoryRepo courseRegistoryRepo;

    public List<Course> showAllCourses()
    {
        return courseRepo.findAll();
    }

    public List<CourseRegistory> getAllEnrolledStudents()
    {
     return courseRegistoryRepo.findAll();
    }

    public void addStundentToCourse(String name, String email, String enrolledCourse)
    {
        CourseRegistory courseEnrolledByStudent = new CourseRegistory(name,email,enrolledCourse);
         courseRegistoryRepo.save(courseEnrolledByStudent);
    }
}
