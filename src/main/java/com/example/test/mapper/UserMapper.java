package com.example.test.mapper;

import com.example.test.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    @Select("select * from sys_user;")
    List<User> allUser();
}
