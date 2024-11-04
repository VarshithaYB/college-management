package com.ust.CollegeApi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.CollegeApi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
