package com.migufun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author NJR10byh
 * @date 2022/8/21 17:43:48
 * @description
 */

@Controller
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/info")
    @ResponseBody
    public String userinfo(String name, int age)
    {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        return "name: " + name + " , " + "age: " + age;
    }
    
}
