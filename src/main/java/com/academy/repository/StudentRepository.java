package com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academy.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
