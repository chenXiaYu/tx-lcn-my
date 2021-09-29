package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    @Insert("insert into user(id, name) values (#{user.id},#{user.name})")
    void  add(@Param(value = "user") User user);
}
