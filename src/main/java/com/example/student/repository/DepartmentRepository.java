package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.models.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    
}
