package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Auther: wuzhumei
 * @Date: 2020/3/12
 * @Description: com.bjsxt.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired(required = true)
    private UsersService usersServiceImpl;
    @RequestMapping("/addUser")
    public String addUser(Users users){
        System.out.println(users.getUsername()+" "+users.getUserage());
        this.usersServiceImpl.insertUser(users);
        return "ok";
    }
}
