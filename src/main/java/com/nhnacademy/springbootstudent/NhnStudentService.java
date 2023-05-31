package com.nhnacademy.springbootstudent;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component // make Bean
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NhnStudentService implements StudentService {

    // 생성자 주입 방식
    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("존재하지 않는 학생입니다."));
    }

    // default = false
    @Transactional
    @Override
    public Student createStudent(Student student) {
        boolean present = studentRepository.findById(student.getId()).isPresent();
        if (present) {
            throw new IllegalStateException("student ID " + student.getId() + " is already exist");
        }
        return studentRepository.save(student);
    }

    // default = false
    @Transactional
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
