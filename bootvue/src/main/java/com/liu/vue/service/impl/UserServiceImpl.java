package com.liu.vue.service.impl;

import com.liu.vue.entity.User;
import com.liu.vue.mapper.UserMapper;
import com.liu.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public boolean save(User user) {
        user.setId(UUID.randomUUID().toString());
        System.out.println("user = " + user);
        return userMapper.save(user);
    }

    @Override
    public void delete(String id) {
        userMapper.delete(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> query(String name, String code) {
        return userMapper.query(name, code);
    }
}
