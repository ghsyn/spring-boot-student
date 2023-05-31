package com.nhnacademy.springbootstudent;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// @RunWith(SpringRunner.class) junit4에서는 필수적으로 써줘야함
@SpringBootTest
@Slf4j
class NhnStudentServiceTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testGetJPAStudents() {
        Student ksy = new Student(1L, "김시연", 999);
        studentRepository.save(ksy);

        Optional<Student> actual = studentRepository.findById(1L);

        assertThat(actual).isPresent();
        assertThat(actual.get()).isEqualTo(ksy);
    }
}