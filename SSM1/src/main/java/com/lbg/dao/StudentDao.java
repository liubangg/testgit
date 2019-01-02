package com.lbg.dao;

import com.lbg.entity.Student;

import java.util.HashMap;
import java.util.List;

public interface StudentDao {
    int selectCount();
    List<Student> findByPage(HashMap<String,Object> map);
    void addStudent(Student student);
    void deleteStudent(Long student_id);
    void updateStudent(Student student);
    Student getStudent(Long student_id);
    List<Student> list();
}
