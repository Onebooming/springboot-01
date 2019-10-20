package com.oneboom.springboot01;

import com.oneboom.springboot01.bean.Person;
import com.oneboom.springboot01.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot01ApplicationTests {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }




}
