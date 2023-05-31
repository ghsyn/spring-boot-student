package com.nhnacademy.springbootstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class StudentNameController {
    @Value("${nhn.student.name}")
    private String name;


}
