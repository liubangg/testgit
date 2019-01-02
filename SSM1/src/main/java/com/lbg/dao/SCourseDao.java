package com.lbg.dao;

import com.lbg.entity.SCourse;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface SCourseDao {
    int selectCount();
    List<SCourse> findByPage(HashMap <String, Object> map);
    void addSCourse(SCourse scourse);
    void deleteSCourse(@Param ("student_id")long student_id,@Param("course_id")int course_id);
    void updateSCourse( SCourse scourse);
    List<SCourse> getSCourse(long student_id);
    SCourse getSCourse1(@Param ("student_id")long student_id,@Param("course_id")int course_id);
    List<SCourse> list();
}
