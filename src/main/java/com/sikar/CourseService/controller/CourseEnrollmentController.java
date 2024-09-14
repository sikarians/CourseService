package com.sikar.CourseService.controller;

import com.sikar.CourseService.Service.CourseEnrollmentService;
import com.sikar.CourseService.model.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseEnrollmentController {
    // path paremeter -> to identify your resource
//    query param -> filter your resource
    // CRUD
//    List<Course> studentList = new ArrayList<>();
    @Autowired
    CourseEnrollmentService courseEnrollmentService;

    @PostMapping("/enroll")
    ResponseEntity<Enrollment> enrollCourse(@RequestBody Enrollment enrollment) {
      return new ResponseEntity<>(courseEnrollmentService.enrollCourse(enrollment), HttpStatus.OK);
    }

}
