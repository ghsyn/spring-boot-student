package com.nhnacademy.springbootstudent;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

// @RunWith(SpringRunner.class) junit4에서는 필수적으로 써줘야함
@SpringBootTest
@Slf4j
class NhnStudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    void testGetStudents() {
        List<Student> actual = studentService.getStudents();

//        System.out.println(actual);
        log.info(actual.toString());
        assertThat(actual.size()).isEqualTo(2);
    }
}