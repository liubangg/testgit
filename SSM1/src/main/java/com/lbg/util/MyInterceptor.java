package com.lbg.util;

import com.lbg.entity.User;
import com.lbg.service.UserService;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request , HttpServletResponse response , Object o) throws Exception {
        String username = (String) request.getSession ().getAttribute("username");
        if(username!=null){
            //登陆成功的用户
            return true;
            }else{
                //没有登陆，转向登陆界面
                request.getRequestDispatcher("/Login").forward(request,response);
                return false;
            }
        }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse , Object o , ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest , HttpServletResponse httpServletResponse , Object o , Exception e) throws Exception {

    }
}
