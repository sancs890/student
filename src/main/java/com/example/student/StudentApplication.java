package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.student.models.Department;
import com.example.student.repository.DepartmentRepository;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

@Component
class DemoCommandLineRunner implements CommandLineRunner {

  @Autowired
  DepartmentRepository repository;

  @Override
  public void run(String... args) throws Exception {
    Department department = new Department();
    department.setName("CS");
	department.setTotalSeats(100);
    Department department2 = new Department();
    department2.setName("EC");
	department2.setTotalSeats(100);
    Department department3 = new Department();
    department3.setName("IT");
	department3.setTotalSeats(100);

    repository.save(department);
    repository.save(department2);
    repository.save(department3);
  }

}
}
