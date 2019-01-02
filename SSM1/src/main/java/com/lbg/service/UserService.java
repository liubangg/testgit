package com.lbg.service;

import com.lbg.entity.User;

public interface UserService {
    User checkLogin(String username, String password);
    void Regist(User user);
}
