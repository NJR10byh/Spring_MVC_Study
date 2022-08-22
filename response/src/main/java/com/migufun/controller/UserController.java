package com.migufun.controller;

import com.migufun.pojo.Address;
import com.migufun.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author NJR10byh
 * @date 2022/8/21 17:43:48
 * @description
 */

@Controller
//@RequestMapping("/user")
public class UserController
{
    // 响应页面/跳转页面
    @RequestMapping("/toPage")
    public String toPage(){
        System.out.println("跳转页面");
        return "index.jsp";
    }
    
    // 响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("文本数据");
        return "helloword!";
    }
    
    // 响应pojo对象：JSON
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        User user=new User();
        user.setName("njr");
        user.setAge(12);
        Address address=new Address();
        address.setProvince("JiangSu");
        address.setCity("NanJing");
        user.setAddress(address);
        return user;
    }
    
    // 响应pojo集合对象：JSON
    @RequestMapping("/toJsonListPojo")
    @ResponseBody
    public List<User> toJsonListPojo(){
        User user1=new User();
        user1.setName("njr");
        user1.setAge(12);
        Address address1=new Address();
        address1.setProvince("JiangSu");
        address1.setCity("NanJing");
        user1.setAddress(address1);
    
        User user2=new User();
        user2.setName("messi");
        user2.setAge(24);
        Address address2=new Address();
        address2.setProvince("ZheJiang");
        address2.setCity("HangZhou");
        user2.setAddress(address2);
    
        List<User> userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        
        return userList;
    }
}
