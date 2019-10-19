package com.oneboom.springboot01.controller;

import com.oneboom.springboot01.properties.EmailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/emailcontroller")
public class EmailController {

    @Autowired
    private EmailProperties emailProperties;

    @RequestMapping("/emailLogin")
    public Object emailLogin(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("username",emailProperties.getUsername());
        map.put("password",emailProperties.getPassword());
        return map;
    }
}
