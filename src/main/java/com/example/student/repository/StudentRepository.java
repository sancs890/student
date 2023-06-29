package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.models.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
