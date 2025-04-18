package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistory;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "http://127.0.0.1:5500")
public class CourseController
{

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> showAllCourses()
    {
        return courseService.showAllCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistory> getAllEnrolledStudents()
    {
        return courseService.getAllEnrolledStudents();
    }

    @PostMapping("/courses/enroll")
    public String addStundentToCourse(@RequestParam ("name") String name,
                                               @RequestParam ("email") String email,
                                               @RequestParam ("enrolledCourse") String enrolledCourse)
    {
         courseService.addStundentToCourse(name,email,enrolledCourse);
         return "Congratulation "+name+"!, You successfully registed for "+enrolledCourse+":)";
    }

}
