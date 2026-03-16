package com.yf.leonadmin.service.impl;


import com.yf.leonadmin.entity.SysUser;
import com.yf.leonadmin.mapper.SysUserMapper;
import com.yf.leonadmin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 杨非
 * @date 2026年03月16日 21:33
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getById(int id) {
        return sysUserMapper.getById(id);
    }

    @Override
    public int insert(SysUser sysUser) {

        return sysUserMapper.insertSysUser(sysUser);
    }
}
