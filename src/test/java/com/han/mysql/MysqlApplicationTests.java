package com.han.mysql;

import com.han.mysql.entity.User;
import com.han.mysql.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MysqlApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println("name is "+user.getName());
    }

}
