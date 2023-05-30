package com.nhnacademy.springbootstudent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@ToString
@EqualsAndHashCode
@Entity
public class Student {
    @Id
    private Long id;
    private String studentName;
    private Integer score;

    public Student() {
    }

    public Student(Long id, String studentName, Integer score) {
        this.id = id;
        this.studentName = studentName;
        this.score = score;
    }
}

