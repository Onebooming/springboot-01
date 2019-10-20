package com.oneboom.springboot01.service;

import com.oneboom.springboot01.entity.UserInfoEntity;
import com.oneboom.springboot01.repository.UserInfoRepository;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Transactional
    public void save() throws Exception {
        try {
            UserInfoEntity userInfoEntity = new UserInfoEntity();
            userInfoEntity.setId(21L);
            userInfoEntity.setUsername("小米");
            userInfoEntity.setNickname("雷军");
            userInfoEntity.setAge("42");
            userInfoRepository.save(userInfoEntity);

            UserInfoEntity userInfoEntity2 = new UserInfoEntity();
            userInfoEntity2.setId(22L);
            userInfoEntity2.setUsername("华为");
            userInfoEntity2.setNickname("余承东");
            userInfoEntity2.setAge("43");
            userInfoRepository.save(userInfoEntity2);
        }catch (Exception e){
            System.out.println("用户保存信息错误");
            e.printStackTrace();

        }

        throw  new RuntimeException();
    }
}
