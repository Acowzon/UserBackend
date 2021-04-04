package com.example.demo.mapper;

import com.example.demo.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 说明：和数据库交互使用的是韩海斌的JDBC代码
 * 采用JDBC和数据库交互
 */

@Mapper
public interface UserMapper {

    UserBean getUserInfo(@Param(value = "userID") String userID);
    UserBean login(@Param("userID")String userID, @Param("password")String password);
    int insertInfo(String userName,String password,String userPhone);
    int userInfoModify(String userID,String password,String userName,String userEmail,String userPhone);

}
