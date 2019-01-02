package com.lbg.service;
import com.lbg.entity.SCourse;
import com.lbg.util.PageBean;
import java.util.List;

public interface SCourseService {
    /**
     * 获取到 Student 的总数
     * @return
     */
    int selectCount();

    /**
     * 增加一条数据
     * @param scourse
     */
    void addSCourse(SCourse scourse);

    /**
     * 删除一条数据
     * @param course_id
     * @param student_id
     */
    void deleteSCourse(long student_id,int course_id);

    /**
     * 更新一条数据
     * @param scourse
     */
    void updateSCourse(SCourse scourse);

    /**
     * 找到一条数据
     * @param student_id
     * @return
     */
    List<SCourse> getSCourse(long student_id);

    /**
     * 找到一条数据
     *  @param course_id
     * @param student_id
     * @return
     */
    SCourse getSCourse1(long student_id,int course_id);
    /**
     * 列举出从 start 位置开始的 count 条数据
     * @return
     */
    List<SCourse> list();
    PageBean<SCourse> findByPage(int currentPage);
}
