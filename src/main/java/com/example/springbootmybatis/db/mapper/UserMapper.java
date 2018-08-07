package com.example.springbootmybatis.db.mapper;

import com.example.springbootmybatis.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by shiyanfei on 2018-08-07
 */
@Repository
public interface UserMapper {
    User getUserById(int id);
}
