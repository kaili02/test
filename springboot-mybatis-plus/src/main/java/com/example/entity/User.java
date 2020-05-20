package com.example.entity;

import lombok.Data;

/**
 * Created By kaili
 * Date: 2020/05/17
 * Description: TODO
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Integer deleteFlag;
}
