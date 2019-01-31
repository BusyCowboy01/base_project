package com.wsw.mybatis.mapper;

import com.wsw.mybatis.entity.User;

import java.util.List;

/**
 * mapper.xml配置方式
 */
public interface UserMapper {
     List<User> findAll();

     User getUserById(int id);
}
