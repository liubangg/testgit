package com.lbg.service;

import com.lbg.dao.SCourseDao;

import com.lbg.entity.SCourse;
import com.lbg.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SCourseServiceImpl implements SCourseService {

    @Autowired
    SCourseDao scourseDao;

    public int selectCount() { return scourseDao.selectCount(); }
    public PageBean<SCourse> findByPage(int currentPage) {
        HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<SCourse> pageBean = new PageBean<SCourse>();

        //封装当前页数
        pageBean.setCurrPage(currentPage);

        //每页显示的数据
        int pageSize=5;
        pageBean.setPageSize(pageSize);

        //封装总记录数
        int totalCount = scourseDao.selectCount();
        pageBean.setTotalCount(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        //封装每页显示的数据
        List<SCourse> lists = scourseDao.findByPage ( map );
        pageBean.setLists(lists);

        return pageBean;
    }
    public void addSCourse(SCourse scourse) {
        scourseDao.addSCourse(scourse);
    }

    public void deleteSCourse(long student_id,int course_id) {
        scourseDao.deleteSCourse(student_id,course_id);
    }

    public void updateSCourse(SCourse scourse) {
        scourseDao.updateSCourse(scourse);
    }

    public List<SCourse> getSCourse(long student_id) {
        return scourseDao.getSCourse(student_id); }
    public SCourse getSCourse1(long student_id,int course_id) {
        return scourseDao.getSCourse1(student_id,course_id); }

    public List<SCourse> list() {
        return scourseDao.list();
    }
}


