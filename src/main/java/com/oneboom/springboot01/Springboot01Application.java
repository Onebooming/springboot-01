package com.oneboom.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication：来标注SpringBoot主程序
 */
@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) {
        /**
         * Spring应用启动起来
         * @param1:主程序类.class(Springboot01Application.class)
         * @param2:main方法的args
         */
        SpringApplication.run(Springboot01Application.class, args);
    }
}
