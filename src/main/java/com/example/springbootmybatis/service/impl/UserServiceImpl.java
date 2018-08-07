package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.db.mapper.UserMapper;
import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shiyanfei on 2018-08-07
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper mapper;

    @Override
    public User getUserById(int id) {
        return mapper.getUserById(id);
    }
}
