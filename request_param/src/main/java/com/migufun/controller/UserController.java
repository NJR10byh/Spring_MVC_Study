package com.migufun.controller;

import com.migufun.pojo.User;
import org.springframework.stereotype.Controller;
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
    // 普通参数
    @RequestMapping("/normal")
    @ResponseBody
    public String normal(@RequestParam("username") String name, int age)
    {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        return "{'module':'普通参数'}";
    }
    
    // POJO类型参数
    @RequestMapping("/pojo")
    @ResponseBody
    public String pojo(User user)
    {
        System.out.println(user);
        user.toString();
        return "{'module':'POJO类型参数'}";
    }
    
    // 嵌套POJO类型参数
    @RequestMapping("/pojo_pro")
    @ResponseBody
    public String pojo_pro(User user)
    {
        System.out.println(user);
        user.toString();
        return "{'module':'嵌套POJO类型参数'}";
    }
    
    /**
     * 数组和集合的名称 要和 请求Key的名称保持一致
     */
    // 数组类型参数
    @RequestMapping("/likes")
    @ResponseBody
    public String likes(String[] likes)
    {
        System.out.println(Arrays.toString(likes));
        return "{'module':'数组类型参数'}";
    }
    
    // 集合类型参数
    @RequestMapping("/listparam")
    @ResponseBody
    public String listParam(@RequestParam List<String> lists)
    {
        System.out.println(lists);
        return "{'module':'集合类型参数'}";
    }
}
