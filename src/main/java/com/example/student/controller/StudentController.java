package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.models.Department;
import com.example.student.models.Student;
import com.example.student.repository.DepartmentRepository;
import com.example.student.repository.StudentRepository;

import jakarta.websocket.server.PathParam;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(path="/department/{departmentId}/students")
    public ResponseEntity createStudent(@RequestBody Student student, @PathVariable(value = "departmentId") int departmentId) {
        Department department = departmentRepository.findById(departmentId).get();
        student.setDepartment(department);
        repository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
