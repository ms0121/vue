package com.liu.vue.controller;

import com.liu.vue.entity.User;
import com.liu.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    public List<User> findAlL(){
        List<User> users = userService.findAll();
        System.out.println("users = " + users);
        return users;
    }


    @PostMapping("save")
    public Map<String, Object> save(@RequestBody User user){
        System.out.println("user = " + user);
        HashMap<String, Object> res = new HashMap<>();
        boolean flag = userService.save(user);
        res.put("msg", flag);
        return res;
    }

    @GetMapping("delete")
    public Map<String, Object> delete(String id){
        System.out.println("id = " + id);
        HashMap<String, Object> res = new HashMap<>();
        try{
            userService.delete(id);
            res.put("msg", "删除成功");
        }catch(Exception e){
            res.put("msg", "删除失败");
        }
        return res;
    }


}
