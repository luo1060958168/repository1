package com.itheima.web.controller;

import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RequestMapping("/user")
//@ResponseBody
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll(){
        List<User> userList = userService.findAll();
        return userList;
    }

    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public User findById(Integer id){
        User user = userService.findById(id);
        return user;
    }

    /**
     * 更新用户
     * @param user
     */
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }


}
