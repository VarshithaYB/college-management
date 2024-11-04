package com.ust.CollegeApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.CollegeApi.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
