package com.liu.demo.controller;

import com.liu.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
@CrossOrigin  // 解决跨域的问题
public class UserController {

    @GetMapping("findAll")
    public List<User> findAll() {
        get().forEach(user -> {
            System.out.println("user = " + user);
        });
        return get();
    }

    @GetMapping("findById")
    public User findById(Integer id) {
        System.out.println("id = " + id);
        List<User> userList = get();
        User user = userList.get(id - 1);
        return user;
    }

    @PostMapping("save")
    public Map<String, Object> save(@RequestBody User user){
        System.out.println("user = " + user);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "保存成功");
        return map;
    }



    public List<User> get() {
        ArrayList<User> userList = new ArrayList<>();
        User user = new User(1, "zhangsan", 20, "11@qq.com");
        User user1 = new User(2, "lisi", 18, "12@qq.com");
        User user2 = new User(3, "wangwu", 24, "13@qq.com");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        return userList;
    }


}
