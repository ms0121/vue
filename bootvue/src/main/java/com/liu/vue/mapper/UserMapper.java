package com.liu.vue.mapper;

import com.liu.vue.entity.User;
import javafx.scene.layout.BorderImage;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    boolean save(User user);

    void delete(String id);

}
