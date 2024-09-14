package com.sikar.CourseService.Service;

import com.sikar.CourseService.model.Enrollment;
import com.sikar.CourseService.repos.CourseEnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseEnrollmentService {
    @Autowired
    CourseEnrollmentRepository courseEnrollmentRepository;

    public Enrollment enrollCourse(Enrollment enrollment)
    {
        return courseEnrollmentRepository.save(enrollment);
    }

//    public List<Enrollment> getCourseEnrollments(Long studentId) {
//        Optional<Course> course = courseEnrollmentRepository.findById(id);
//
//        if (course.isPresent()) {
//            return course.get();
//        }
//       throw new CourseNotFoundException("Course not found for the id " + id);
//    }
}