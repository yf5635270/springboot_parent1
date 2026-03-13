package com.yf.service.impl;

import com.yf.entity.Usersba;
import com.yf.mapper.UserMapper;
import com.yf.service.UsersbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 杨非
 * @date 2026年03月13日 12:18
 */
@Service
public class UsersbaServiceImpl implements UsersbaService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Usersba> findAll() {

        return userMapper.queryUserList();
    }

    @Override
    public Usersba findById(Integer id) {

        return userMapper.queryUserByid(id);
    }
}
