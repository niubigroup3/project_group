package com.citi.dao;

import com.citi.Group3Application;
import com.citi.bean.DemoUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Date;

/**
 * @Auther: chenle
 * @Date: 2020/8/24 - 18:54
 * @Description: com.citi.mapper
 * @version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Group3Application.class)
class UserMapperTest {

    @Resource
    UserMapper userMapper;


    @Test
    void testDeleteUser() {
    }

    @Test
    void selectUserById() {

        DemoUser demoUser = userMapper.selectUserById(1);
        assertEquals(1, demoUser.getId());

    }

    @Test
    void updateUserStatus() {

        int i = userMapper.updateUserStatus(1, 8);
        System.out.println(i);

    }

    @Test
    void selectUserByName() {
        DemoUser user = userMapper.selectUserByName("admin");
        assertEquals("admin", user.getName());
    }
}