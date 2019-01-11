package com.huang.mybatis.mapper;

import com.huang.mybatis.domain.User;

/**
 * @Description TODO
 * @Author huangzt
 * @Date 2019.01.11
 * @Version 1.0
 */
public interface UserMapper {
    User findUserById(Integer id) throws Exception;
}
