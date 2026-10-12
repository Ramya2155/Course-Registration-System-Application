package com.example.courseregistrationsystem.service;

import com.example.courseregistrationsystem.model.Course;
import com.example.courseregistrationsystem.model.CourseRegistry;
import com.example.courseregistrationsystem.repository.CourseRegistryRepo;
import com.example.courseregistrationsystem.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<Course> availableCourse(){
        return courseRepo.findAll();
    }


    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String email, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,email,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
