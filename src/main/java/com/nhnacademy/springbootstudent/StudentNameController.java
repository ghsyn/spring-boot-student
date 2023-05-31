package com.nhnacademy.springbootstudent;

import com.nhnacademy.springbootstudent.configuration.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentNameController {
    @Value("${nhn.student.name}")
    private String name;

    @Autowired
    private StudentProperties studentProperties;

    @GetMapping("/student-name")
    public String getStudentName() {
        return name;
    }

    @GetMapping("/student-name2")
    public String getStudentName2() {
        return studentProperties.getName();
    }
}
