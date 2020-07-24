package com.example.demo.Mapper;

import com.example.demo.User.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user ")
    List<User> findAll();

    @Insert(" insert into user (name) values (#{name}) ")
    public void save(String name);

    @Delete(" delete from user where id= #{id} ")
    public void delete(int id);

    @Select("select * from user where id= #{id} ")
    public User get(int id);

    @Update("update user set name=#{name} where id=#{id} ")
    public int update(String name,int id);
}




