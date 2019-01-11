package com.huang.mybatis.domain;

import lombok.Data;

/**
 * @Description TODO
 * @Author huangzt
 * @Date 2019.01.11
 * @Version 1.0
 */

@Data
public class User {

    private Integer id;
    private String username;
    private String sex;
    private Integer age;
    private String tel;
    private String email;
}
