package com.yf.service;

import com.yf.entity.Usersba;

import java.util.List;

/**
 * @author 杨非
 * @date 2026年03月13日 11:12
 */
public interface UsersbaService {

    public List<Usersba> findAll();

    public Usersba findById(Integer id);
}
