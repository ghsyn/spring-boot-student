package com.nhnacademy.springbootstudent;

import java.util.List;

public interface StudentRepository {

    // 보통 repository에서는 findAll(필터) 쓰는게 관례
    List<Student> findAll();
}
