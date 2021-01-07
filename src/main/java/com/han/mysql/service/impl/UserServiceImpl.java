package com.han.mysql.service.impl;

import com.han.mysql.mapper.UserMapper;
import com.han.mysql.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: CREATED BY W.H.R
 * @Date: 2021/1/7 16:45
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;




}
