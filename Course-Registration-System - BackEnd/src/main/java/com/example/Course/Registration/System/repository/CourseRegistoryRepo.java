package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.CourseRegistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistoryRepo extends JpaRepository <CourseRegistory , Integer>
{
}
