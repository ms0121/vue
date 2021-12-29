package com.liu.vue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.liu.vue.mapper")
public class BootvueApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootvueApplication.class, args);
    }

}
