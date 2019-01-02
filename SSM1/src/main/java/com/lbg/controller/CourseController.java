package com.lbg.controller;

import com.lbg.entity.Course;
import com.lbg.entity.Student;
import com.lbg.service.CourseService;
import com.lbg.service.StudentService;
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

@Controller
@RequestMapping ("")
@SessionAttributes ("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/addCourse")
    public String addStudent(HttpServletRequest request, HttpServletResponse response) {
        Course course = new Course ();
        int course_id = Integer.parseInt (request.getParameter("course_id"));
        String course_name = request.getParameter("course_name");
        double credit= Double.parseDouble (request.getParameter("credit"));
        course.setCourse_id (course_id);
        course.setCourse_name (course_name);
        course.setCredit (credit);
        courseService.addCourse (course);
        return "redirect:course";
    }
    @RequestMapping("/add1")
    public String addcourse(){
        return "add1";
    }
    @RequestMapping("/course")
    public String  main(@RequestParam (value="currentPage",defaultValue="1",required=false)int currentPage, HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("pagemsg", courseService.findByPage(currentPage));//回显分页数据
        return "course";
    }

    @RequestMapping("/deleteCourse")
    public String deleteCourse(int course_id) {
        courseService.deleteCourse(course_id);
        return "redirect:course";
    }
    @RequestMapping("/selectCourse")
    public String selectCourse( int course_id,Model model) {
     Course course= courseService.getCourse (course_id);
        model.addAttribute("course",course);
        return "anotherpage1";
    }

    @RequestMapping("/update1")
    public ModelAndView editCourse(int course_id) {
        ModelAndView mav = new ModelAndView("update1");
        Course course = courseService.getCourse(course_id);
        mav.addObject("course", course);
        return mav;
    }

    @RequestMapping("/updateCourse")
    public String updateCourse(HttpServletRequest request, HttpServletResponse response) {
        Course course = new Course ();
        int course_id = Integer.parseInt (request.getParameter("course_id"));
        String course_name = request.getParameter("course_name");
        double credit= Double.parseDouble (request.getParameter("credit"));
        course.setCourse_id (course_id);
        course.setCourse_name (course_name);
        course.setCredit (credit);
        courseService.updateCourse (course);
        return "redirect:course";
    }
}
