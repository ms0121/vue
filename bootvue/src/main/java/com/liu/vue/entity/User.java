package com.liu.vue.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Setter
@Getter
@Accessors(chain = true)
public class User {

    private String id;
    private String name;
    private int age;
    private double salary;
    private String phoneCode;
}
