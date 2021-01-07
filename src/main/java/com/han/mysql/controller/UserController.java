package com.han.mysql.controller;


import com.han.mysql.entity.User;
import com.han.mysql.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: CREATED BY W.H.R
 * @Date: 2021/1/5 13:31
 **/
@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @PostMapping("/select")
    public void select(){
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println(user.getName());
    }

}
