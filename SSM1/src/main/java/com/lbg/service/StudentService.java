package com.lbg.service;

import com.lbg.entity.Student;
import com.lbg.util.PageBean;

import java.util.List;

public interface StudentService {
    /**
     * 获取到 Student 的总数
     * @return
     */
    int selectCount();

    /**
     * 增加一条数据
     * @param student
     */
    void addStudent(Student student);

    /**
     * 删除一条数据
     * @param student_id
     */
    void deleteStudent(long student_id);

    /**
     * 更新一条数据
     * @param student
     */
    void updateStudent(Student student);

    /**
     * 找到一条数据
     * @param student_id
     * @return
     */
    Student getStudent(long  student_id);

    /**
     * 列举出从 start 位置开始的 count 条数据
     * @return
     */
    List<Student> list();
    PageBean<Student> findByPage(int currentPage);
}
