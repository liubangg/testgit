package com.lbg.service;
import com.lbg.entity.Course;
import com.lbg.util.PageBean;
import java.util.List;

public interface CourseService {
    /**
     * 获取到 Student 的总数
     * @return
     */
    int selectCount();

    /**
     * 增加一条数据
     * @param course
     */
    void addCourse(Course course);

    /**
     * 删除一条数据
     * @param course_id
     */
    void deleteCourse(int course_id);

    /**
     * 更新一条数据
     * @param course
     */
    void updateCourse(Course course);

    /**
     * 找到一条数据
     * @param course_id
     * @return
     */
    Course getCourse(int course_id);

    /**
     * 列举出从 start 位置开始的 count 条数据
     * @return
     */
    List<Course> list();
    PageBean<Course> findByPage(int currentPage);
}
