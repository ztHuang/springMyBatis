package com.huang.mybatis.dao.impl;

import com.huang.mybatis.domain.User;
import com.huang.mybatis.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void findUserById() throws Exception {
        UserMapper userMapper = applicationContext.getBean("userMapper",UserMapper.class);
        User user = userMapper.findUserById(5245);
        System.out.println(user);
    }
}