package com.nhnacademy.springbootstudent;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // make Bean
@RequiredArgsConstructor
public class NhnStudentService implements StudentService {

    // 생성자 주입 방식
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
