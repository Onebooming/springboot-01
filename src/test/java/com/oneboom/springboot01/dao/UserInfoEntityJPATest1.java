package com.oneboom.springboot01.dao;

import com.oneboom.springboot01.entity.UserInfoEntity;
import com.oneboom.springboot01.repository.UserInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.statements.SpringRepeat;

import javax.annotation.security.RunAs;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoEntityJPATest1 {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void save(){
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setId(50L);
        userInfoEntity.setUsername("BlusLi");
        userInfoEntity.setAge("20");
        userInfoEntity.setNickname("Dog");

        userInfoRepository.save(userInfoEntity);
    }

    @Test
    public void contextLoads(){

    }
}
