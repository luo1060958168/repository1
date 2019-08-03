package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
    /**
     * 查询用户列表
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据用户id查询用户
     * @param userId
     * @return
     */
    @Select("select * from user where id=#{userId}")
    User findById(Integer userId);

    /**
     * 修改用户
     * @param user
     */
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);
}
