package com.oneboom.springboot01.query;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Component
@Data
public class UserInfoQuery {

    @NotNull(message = "用户编号不能为空")
    @Pattern(regexp = "^[1-10]$",message = "用户编号范围不争取")
    private String id;

    @NotNull(message = "用户账号不能为空")
    private String username;
}
