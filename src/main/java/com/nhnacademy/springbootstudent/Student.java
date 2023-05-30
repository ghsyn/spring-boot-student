package com.nhnacademy.springbootstudent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

// final로 된 변수들만 생성자 안만들어도됨
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Student {
    private final String studentName;
    private final Integer score;

}

