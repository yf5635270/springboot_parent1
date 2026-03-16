package com.yf.leonadmin.service;

import com.yf.leonadmin.entity.SysUser;

public interface SysUserService  {

    public SysUser getById(int id);

    public int insert(SysUser sysUser);
}
