package com.itheima.service;

import com.itheima.pojo.User;

/**
 * @description:
 * @author: Cailiang Cao
 * @date: 2020/8/2 17:38
 */
public interface UserService {
    // 查询用户信息
    User findById(Integer id);
}
