package edu.icet.demo.controller;

import edu.icet.demo.model.Student;
import edu.icet.demo.service.StudentService;
import edu.icet.demo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }
}
