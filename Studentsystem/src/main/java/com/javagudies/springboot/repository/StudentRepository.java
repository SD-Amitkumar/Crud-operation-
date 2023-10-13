package com.javagudies.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javagudies.springboot.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {



}
