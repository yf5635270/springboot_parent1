package com.yf.leonadmin.mapper;

import com.yf.leonadmin.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 杨非
 * @date 2026年03月16日 21:31
 */
@Mapper
// @Repository          //需要与启动类的@MapperScan("com.yf.leonadmin.mapper")一起使用
public interface SysUserMapper  {

    int insertSysUser(SysUser sysUser);

    int updateSysUser(SysUser sysUser);

    int delSysUser(Integer id);

    SysUser getById(int id);

    List<SysUser> getList();

    Integer selCount(String admin);
}
