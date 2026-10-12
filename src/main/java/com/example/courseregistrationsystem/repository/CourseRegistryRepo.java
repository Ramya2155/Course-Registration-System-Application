package com.example.courseregistrationsystem.repository;

import com.example.courseregistrationsystem.model.Course;
import com.example.courseregistrationsystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
