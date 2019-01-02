package com.lbg.controller;

import com.lbg.entity.Course;
import com.lbg.entity.SCourse;
import com.lbg.entity.Student;
import com.lbg.service.CourseService;
import com.lbg.service.SCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping ("")
public class SCourseController {

    @Autowired
    private SCourseService scourseService;

    @RequestMapping("/addSCourse")
    public String addStudent(HttpServletRequest request, HttpServletResponse response) {
        SCourse scourse = new SCourse ();
        Long student_id = Long.parseLong (request.getParameter("student_id"));
        int course_id = Integer.parseInt (request.getParameter("course_id"));
        Double mark = Double.parseDouble (request.getParameter("mark"));
        scourse.setCourse_id (course_id);
        scourse.setStudent_id ( student_id );
        scourse.setMark (mark);
        scourseService.addSCourse (scourse);
        return "redirect:scourse";
    }
    @RequestMapping("/add2")
    public String addScourse(){
        return "add2";
    }
    @RequestMapping("/scourse")
    public String  main(@RequestParam (value="currentPage",defaultValue="1",required=false)int currentPage, HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("pagemsg", scourseService.findByPage(currentPage));//回显分页数据
        return "scourse";
    }

    @RequestMapping("/deleteSCourse")
    public String deleteSCourse(long student_id,int course_id) {
        scourseService.deleteSCourse(student_id,course_id);
        return "redirect:scourse";
    }
    @RequestMapping("/selectSCourse")
    public String selectSCourse( HttpServletRequest request, HttpServletResponse response) {
       long student_id = Long.parseLong (request.getParameter("student_id"));
        List<SCourse> scourses = scourseService.getSCourse(student_id);
        System.out.println (scourses.toString () );
       request.setAttribute ("scourses",scourses);
        return "anotherpage2";
    }

    @RequestMapping("/update2")
    public ModelAndView editCourse1(long student_id,int course_id) {
        ModelAndView mav = new ModelAndView("update2");
        SCourse scourse = scourseService.getSCourse1(student_id,course_id);
        mav.addObject("scourse", scourse);
        return mav;
    }

    @RequestMapping("/updateSCourse")
    public String updateCourse(HttpServletRequest request, HttpServletResponse response) {
        SCourse scourse = new SCourse ();
        Long student_id = Long.parseLong (request.getParameter("student_id"));
        System.out.println (student_id );
        System.out.println ("111" );
        int course_id = Integer.parseInt (request.getParameter("course_id"));
        Double mark = Double.parseDouble (request.getParameter("mark"));
        scourse.setStudent_id (student_id);
        scourse.setCourse_id (course_id);
        scourse.setMark (mark);
        scourseService.updateSCourse (scourse);
        return "redirect:scourse";
    }
}
