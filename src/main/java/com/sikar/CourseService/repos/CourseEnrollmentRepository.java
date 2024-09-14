package com.sikar.CourseService.repos;

import com.sikar.CourseService.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEnrollmentRepository extends JpaRepository<Enrollment, Long> {

}