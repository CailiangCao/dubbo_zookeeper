package com.itheima.dao;

import com.itheima.pojo.User;

/**
 * @description:
 * @author: Cailiang Cao
 * @date: 2020/8/2 17:50
 */
public interface UserDao {
    User findById(Integer id);
}
