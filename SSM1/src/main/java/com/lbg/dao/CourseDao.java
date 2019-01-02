package com.lbg.dao;

import com.lbg.entity.Course;


import java.util.HashMap;
import java.util.List;

public interface CourseDao {
    int selectCount();
    List<Course> findByPage(HashMap <String, Object> map);
    void addCourse(Course course);
    void deleteCourse(int course_id);
    void updateCourse(Course course);
    Course getCourse(int course_id);
    List<Course> list();
}
