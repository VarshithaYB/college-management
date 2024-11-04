package com.ust.CollegeApi.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.CollegeApi.entity.Stream;

public interface StreamRepository extends JpaRepository<Stream, Long> {
}

