package com.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springboot.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
