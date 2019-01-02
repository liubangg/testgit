package com.lbg.service;

import com.lbg.dao.CourseDao;
import com.lbg.entity.Course;
import com.lbg.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    public int selectCount() { return courseDao.selectCount(); }
    public PageBean<Course> findByPage(int currentPage) {
        HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Course> pageBean = new PageBean<Course>();

        //封装当前页数
        pageBean.setCurrPage(currentPage);

        //每页显示的数据
        int pageSize=5;
        pageBean.setPageSize(pageSize);

        //封装总记录数
        int totalCount = courseDao.selectCount();
        pageBean.setTotalCount(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        //封装每页显示的数据
        List<Course> lists = courseDao.findByPage ( map );
//        List<Course> lists = courseDao.findByPage(map);
        pageBean.setLists(lists);

        return pageBean;
    }
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    public void deleteCourse(int course_id) {
        courseDao.deleteCourse(course_id);
    }

    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    public Course getCourse(int course_id) {
        return courseDao.getCourse(course_id); }

    public List<Course> list() {
        return courseDao.list();
    }
}


