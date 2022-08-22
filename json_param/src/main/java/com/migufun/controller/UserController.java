package com.migufun.controller;

import com.migufun.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @author NJR10byh
 * @date 2022/8/21 17:43:48
 * @description
 */

@Controller
@RequestMapping("/user")
public class UserController
{
    // 集合参数：json格式
    @RequestMapping("/json_listparam")
    @ResponseBody
    public String json_listparam(@RequestBody List<String> likes){
        System.out.println(likes);
        return "{'module':'json_listparam'}";
    }
    
    // pojo参数：json格式
    @RequestMapping("/json_pojoparam")
    @ResponseBody
    public String json_pojoparam(@RequestBody User user){
        System.out.println(user);
        return "{'module':'json_pojoparam'}";
    }
    
    // 集合参数：json格式
    @RequestMapping("/json_listpojoparam")
    @ResponseBody
    public String json_listpojoparam(@RequestBody List<User> list){
        System.out.println(list);
        return "{'module':'json_listpojoparam'}";
    }
}
