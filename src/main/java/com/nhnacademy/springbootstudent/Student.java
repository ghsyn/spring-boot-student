package com.nhnacademy.springbootstudent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
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
    private String name;
    private Integer score;

    public Student() {
    }

    public Student(Long id, String name, Integer score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}

