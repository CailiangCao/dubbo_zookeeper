package com.itheima.service.impl;

import com.itheima.pojo.User;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: Cailiang Cao
 * @date: 2020/8/2 17:49
 */

public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User findById(Integer id) {
        System.out.println("dubbo端口:20882");
        return userDao.findById(id);
    }
}
