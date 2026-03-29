package com.yf.leonadmin.service;

import com.yf.leonadmin.entity.SysUser;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public interface SysUserService  {

    public SysUser getById(Integer id);

    public Integer insert(SysUser sysUser);

    public Integer update(SysUser sysUser);

    public Integer delSysUser(Integer id);

    public List<SysUser> getList();

    public Integer getCount(String username);


    SysUser getUserByCookie(String userTicket, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
}
