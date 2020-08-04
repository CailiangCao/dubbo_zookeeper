package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Cailiang Cao
 * @date: 2020/8/3 10:29
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    //@Autowired
    @Reference
    UserService userService;

    @RequestMapping("/findById")
    public User findById(Integer id) {
        User user = userService.findById(id);
        System.out.println(user);
        return user;
    }
}
