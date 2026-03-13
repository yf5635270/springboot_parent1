package com.yf.mapper;

import com.yf.entity.User;
import com.yf.entity.Usersba;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 杨非
 * @date 2026年03月13日 10:22
 */
@Mapper
@Repository
public interface UserMapper {

    List<Usersba> queryUserList();

    Usersba queryUserByid(int d);
    //
    // int addUser(User user);
    //
    // int updateUser(User user);
    //
    // int deleteUser(int id);
}
