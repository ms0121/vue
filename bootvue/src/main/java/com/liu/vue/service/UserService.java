package com.liu.vue.service;

import com.liu.vue.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    boolean save(User user);

    void delete(String id);

    void update(User user);

    User findById(String id);

    List<User> query(String name, String code);
}
