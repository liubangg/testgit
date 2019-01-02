package com.lbg.controller;

import com.lbg.entity.User;
import com.lbg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
@Controller
@RequestMapping("")
//@SessionAttributes("user")
//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
public class UserController {
    @Autowired
    private UserService userServivce;

    //正常访问login页面

    @RequestMapping("/Login")
    public String Login(HttpSession session,User user){

        return "Login";
    }
    @RequestMapping("/manage")
    public String manange(){
        return "manage";
    }
    @RequestMapping("/manage1")
    public String manange1(){
        return "manage1";
    }
    @RequestMapping("/manage2")
    public String manange2(){
        return "manage2";
    }
    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(HttpSession session,User user, Model model){
        //调用service方法
        user = userServivce.checkLogin(user.getUsername(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            session.setAttribute("username",user.getUsername ());
            return "redirect:student1";
        }
        return "fail";
    }

    //测试超链接跳转到另一个页面是否可以取到session值
    @RequestMapping("/anotherpage")
    public String hrefpage(){

        return "anotherpage";
    }
    @RequestMapping("/anotherpage1")
    public String hrefpage1(){

        return "anotherpage1";
    }
    @RequestMapping("/anotherpage2")
    public String hrefpage2(){

        return "anotherpage2";
    }
    //注销方法
    @RequestMapping ("/outlogin")
    public String outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "Login";
    }

    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }

    @RequestMapping("/doRegist")
    public String doRegist(User user,Model model){
        System.out.println(user.getUsername());
        userServivce.Regist(user);
        return "redirect:Login";
    }
}
