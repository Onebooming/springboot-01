package com.oneboom.springboot01.dao;

import com.oneboom.springboot01.entity.UserInfoEntity;
import com.oneboom.springboot01.repository.UserInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoEntityJpaAdd {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void add(){
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setId(20L);
        userInfoEntity.setUsername("马化腾");
        userInfoEntity.setNickname("Jack Ma");
        userInfoEntity.setAge("56");

        userInfoRepository.save(userInfoEntity);
    }
}
