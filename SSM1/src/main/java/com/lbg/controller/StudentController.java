package com.lbg.controller;

import com.lbg.entity.Student;
import com.lbg.service.StudentService;
import com.lbg.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping ("")
@SessionAttributes ("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/addStudent")
    public String addStudent(HttpServletRequest request, HttpServletResponse response) {

        Student student = new Student();
        long student_id = Long.parseLong (request.getParameter("student_id"));
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String major = request.getParameter("major");
        int age = Integer.parseInt(request.getParameter("age"));
       long telephone_number = Long.parseLong (request.getParameter("telephone_number"));
        Date birthday = null;
        // String 类型按照 yyyy-MM-dd 的格式转换为 java.util.Date 类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birthday = simpleDateFormat.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        student.setStudent_id(student_id);
        student.setName(name);
        student.setSex(sex);
        student.setMajor (major);
        student.setAge(age);
        student.setTelephone_number (telephone_number);
        student.setBirthday(birthday);
        studentService.addStudent(student);

        return "redirect:student1";
    }
    @RequestMapping("/add")
    public String addstudent(){
        return "add";
    }
    //原来的方法
//    @RequestMapping("/student")
//    public String listStudent(HttpServletRequest request, HttpServletResponse response) {
//
//        List<Student> students = studentService.list();
//        request.setAttribute("students", students);
//        return "redirect:student1";
//    }
    //显示所有学生
//    @RequestMapping("/student")
//    public String listStudent(HttpServletRequest request, HttpServletResponse response) {
//
//        List<Student> students = studentService.list();
//        request.setAttribute("students", students);
//        return "redirect:student1";
//    }
    @RequestMapping("/student1")
    public String  main(@RequestParam (value="currentPage",defaultValue="1",required=false)int currentPage, HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("pagemsg", studentService.findByPage(currentPage));//回显分页数据
        return "student1";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(long student_id) {
        studentService.deleteStudent(student_id);
        return "redirect:student1";
    }
    @RequestMapping("/selectStudent")
    public String selectStudent( long student_id,Model model) {
     Student student= studentService.getStudent (student_id);
        model.addAttribute("student",student);
        System.out.println (student.getAge () );
        return "anotherpage";
    }

    @RequestMapping("/update")
    public ModelAndView editStudent(long student_id) {
        ModelAndView mav = new ModelAndView("update");
        Student student = studentService.getStudent(student_id);
        mav.addObject("student", student);
        return mav;
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(HttpServletRequest request, HttpServletResponse response) {

        Student student = new Student();

//        int id = Integer.parseInt(request.getParameter("id"));
        Long student_id = Long.parseLong (request.getParameter("student_id"));
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String major = request.getParameter("major");
        int age = Integer.parseInt(request.getParameter("age"));
        Long telephone_number = Long.parseLong (request.getParameter("telephone_number"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = simpleDateFormat.parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        student.setId(id);
        student.setStudent_id(student_id);
        student.setName(name);
        student.setSex(sex);
        student.setMajor (major);
        student.setAge(age);
        student.setTelephone_number (telephone_number);
        student.setBirthday(birthday);
        studentService.updateStudent(student);
        return "redirect:student1";
    }
}
