package com.yf.leonadmin.service.impl;


import com.yf.leonadmin.entity.SysUser;
import com.yf.leonadmin.mapper.SysUserMapper;
import com.yf.leonadmin.service.SysUserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 杨非
 * @date 2026年03月16日 21:33
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public SysUser getById(Integer id) {
        return sysUserMapper.getById(id);
    }

    @Override
    public Integer insert(SysUser sysUser) {

        return sysUserMapper.insertSysUser(sysUser);
    }

    @Override
    public Integer update(SysUser sysUser) {
        return sysUserMapper.updateSysUser(sysUser);
    }

    @Override
    public Integer delSysUser(Integer id) {
        return sysUserMapper.delSysUser(id);
    }

    @Override
    public List<SysUser> getList() {
        return sysUserMapper.getList();
    }

    @Override
    public Integer getCount(String username) {
        return sysUserMapper.selCount(username);
    }


    @Override
    public SysUser getUserByCookie(String userTicket, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        SysUser sysuser = (SysUser)redisTemplate.opsForValue().get("user:"+userTicket);
        if(sysuser!=null){
            // Cookie

            return sysuser;
        }
        return sysuser;
    }
}
