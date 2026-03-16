package com.yf.leonadmin.mapper;

import com.yf.leonadmin.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 杨非
 * @date 2026年03月16日 21:31
 */
@Mapper
@Repository
public interface SysUserMapper  {

    int insertSysUser(SysUser sysUser);

    SysUser getById(int id);
}
