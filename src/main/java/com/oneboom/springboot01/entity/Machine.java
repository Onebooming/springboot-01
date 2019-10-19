package com.oneboom.springboot01.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "machine_info", indexes = @Index(columnList = "machineName"))
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(10)  comment '主键'")
    private Long id;

    @Column(name = "machineName", columnDefinition = "varchar(30) not null default '' comment '账号'")
    private String machineName;

    @Column(name = "password", columnDefinition = "varchar(20) not null default '' comment '密码'")
    private String password;

    @Column(name = "username", columnDefinition = "varchar(20) not null default '' comment '使用者'")
    private String username;

    @Column(name = "role_id", columnDefinition = "bigint(10) not null default 0 comment '角色'")
    private Long roleId;
}
