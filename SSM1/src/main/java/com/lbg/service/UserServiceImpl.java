package com.lbg.service;

import com.lbg.dao.UserDao;
import com.lbg.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    /*
     * 检验用户登录业务
     *
     */

    public User checkLogin(String username, String password) {

        User user = userDao.findByUsername(username);
        if(user != null && user.getPassword().equals(password)){

            return user;
        }
        return null;
    }

    @Override
    public void Regist(User user) {

        userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());

    }
}
