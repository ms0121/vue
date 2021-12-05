package com.liu.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("city")
@CrossOrigin
public class CityController {

    @GetMapping("find")
    public Map<String, Object> find(String city){
        String msg = getCity(city);
        System.out.println("msg = " + msg);
        HashMap<String, Object> res = new HashMap<>();
        res.put("code", 200);
        res.put("msg", msg);
        return res;
    }



    public String getCity(String city){
        HashMap<String, Object> map = new HashMap<>();
        map.put("北京", "白雪皑皑");
        map.put("上海", "秋高气爽");
        map.put("广州", "阴雨绵绵");
        map.put("深圳", "艳阳高照");
        return (String) map.get(city);
    }

}
