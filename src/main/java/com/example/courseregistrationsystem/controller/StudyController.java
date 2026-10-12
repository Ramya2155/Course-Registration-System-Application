package com.example.courseregistrationsystem.controller;

import com.example.courseregistrationsystem.model.Course;
import com.example.courseregistrationsystem.model.CourseRegistry;
import com.example.courseregistrationsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// http://127.0.0.1:5500/course/enrolled
// http://127.0.0.1:5500/study/entrolled

@RestController
@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:5500"})
public class StudyController {
    @Autowired
    CourseService courseService;
    @GetMapping("/study")
    public List<Course> availableCourse(){
        return courseService.availableCourse();
    }
    @GetMapping("/study/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }
    @PostMapping("/study/register")
    public String enrollCourse(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,email,courseName);
        return "Congratulations " +name+" Enrollment Successful for "+courseName;
    }
}
