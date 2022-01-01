package com.toleey.lifecommunity.dao;

import com.toleey.lifecommunity.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //查找全部用户
    public List<User> findAllUsers();

    //注册用户
    public Integer insertAUser(User user);

    //查询用户 根据用户手机号
    public User finaAUserByPhoneNumber(String phoneNumber);

    //修改用户名依据手机号
    public Integer updateAvatorByPhoneNumber(@Param("avator") String avator,@Param("phoneNumber") String phoneNumber);

    //修改昵称依据手机号
    public Integer updateUserNameByPhoneNumber(@Param("userName") String userName,@Param("phoneNumber") String phoneNumber);

    //修改密码依据手机号
    public Integer updatePasswordByPhoneNumber(@Param("password") String password,@Param("phoneNumber") String phoneNumber);




}