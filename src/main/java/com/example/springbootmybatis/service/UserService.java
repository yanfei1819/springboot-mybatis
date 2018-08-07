package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by shiyanfei on 2018-08-07
 */
public interface UserService {
    User getUserById(@Param("id") int id);
}
