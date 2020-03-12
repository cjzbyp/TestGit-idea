package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: wuzhumei
 * @Date: 2020/3/11
 * @Description: com.bjsxt.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    public void insertUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
