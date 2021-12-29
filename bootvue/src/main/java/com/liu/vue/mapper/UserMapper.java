package com.liu.vue.mapper;

import com.liu.vue.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    boolean save(User user);

    void delete(String id);

    void update(User user);

    User findById(String id);

    List<User> query(String name, String code);

}
