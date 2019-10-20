package com.oneboom.springboot01.entity;

import lombok.Data;

import javax.persistence.*;

@Data
/*
@Data: 自动生成GET和SET方法的注解，该注解可以在类上和属性中添加。
如果添加在类上，是表示自动为该实体类的所有属性创建GET和SET方法。
如果添加到属性中则表示只会为该属性添加GET和SET方法。
* */
@Entity
/*
 * @Entity: 实体类注解。只有标识该注解的类，JPA才能自动将这个类中的属性和数据库进行映射。
 * @Table: 标识该实体类和数据库中哪个表进行映射
 */
@Table(name = "user_info")
public class UserInfoEntity {
    /*
        @Id: 标识该自动为主键标识。
        @GeneratedValue: 标识主键的生成规则
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String age;

    private String nickname;

    public Long getId(){
        return this.id;
    }
}
