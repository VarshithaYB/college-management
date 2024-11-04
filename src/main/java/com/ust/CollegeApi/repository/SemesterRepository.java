package com.ust.CollegeApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.CollegeApi.entity.Semester;

public interface SemesterRepository extends JpaRepository<Semester, Long> {
}
