package com.lbg.service;

import com.lbg.dao.StudentDao;
import com.lbg.entity.Student;
import com.lbg.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    public int selectCount() { return studentDao.selectCount(); }
    public PageBean<Student> findByPage(int currentPage) {
        HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Student> pageBean = new PageBean<Student>();

        //封装当前页数
        pageBean.setCurrPage(currentPage);

        //每页显示的数据
        int pageSize=5;
        pageBean.setPageSize(pageSize);

        //封装总记录数
        int totalCount = studentDao.selectCount();
        pageBean.setTotalCount(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        //封装每页显示的数据
        List<Student> lists = studentDao.findByPage(map);
        pageBean.setLists(lists);

        return pageBean;
    }
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void deleteStudent(long student_id) {
        studentDao.deleteStudent(student_id);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public Student getStudent(long student_id) {
        return studentDao.getStudent(student_id);
    }

    public List<Student> list() {
        return studentDao.list();
    }
}


