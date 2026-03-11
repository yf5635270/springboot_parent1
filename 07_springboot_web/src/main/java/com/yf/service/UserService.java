package com.yf.service;

import com.yf.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 杨非
 * @date 2026年03月11日 10:02
 */
@Component
public class UserService {

    private static Map<Integer, User> users = new HashMap<>();


    static {
        users.put(1,new User(1,"小王","北京"));
        users.put(2,new User(2,"小张","上海"));
        users.put(3,new User(3,"小李","广州"));
        users.put(4,new User(4,"小红","深圳"));
        users.put(5,new User(5,"小杨","南宁"));
        users.put(6,new User(6,"小黎","四川"));
    }

    public User getUserByid(Integer id){
        return users.get(id);
    }

    public List<User> getAllUser(){
        return new ArrayList<>(users.values());
    }

    public void update(User user){
        users.replace(user.getId(), user);
    }

    public void add(User user){
        Integer newid = users.size()+1;
        user.setId(newid);
        users.put(newid,user);
    }

    public void delete(Integer id){
        users.keySet().removeIf(key -> key==id);
    }



}
