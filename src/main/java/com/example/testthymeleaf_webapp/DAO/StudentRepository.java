package com.example.testthymeleaf_webapp.DAO;

import com.example.testthymeleaf_webapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
