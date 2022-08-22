package com.migufun.controller;

import com.migufun.pojo.Address;
import com.migufun.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author NJR10byh
 * @date 2022/8/21 17:43:48
 * @description
 */

@RestController
@RequestMapping("/user")
public class UserController
{
    // 获取全部
    @GetMapping()
    public List<User> getAll(){
        System.out.println("getAll");
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAge(21);
        Address address1 = new Address();
        address1.setProvince("JiangSu");
        address1.setCity("NanJing");
        user1.setAddress(address1);
        User user2 = new User();
        user2.setName("lisi");
        user2.setAge(26);
        Address address2 = new Address();
        address2.setProvince("ZheJiang");
        address2.setCity("HangZhou");
        user2.setAddress(address2);
    
        List<User> userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
    // 获取指定id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        System.out.println("getUserById id = "+id);
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAge(21);
        Address address1 = new Address();
        address1.setProvince("JiangSu");
        address1.setCity("NanJing");
        user1.setAddress(address1);
        return user1;
    }
    
    // 保存数据
    @PostMapping
    public String saveUser(@RequestBody User user){
        System.out.println("save ==> "+user);
        return "save success!";
    }
    
    // 更新数据
    @PutMapping
    public String putUser(@RequestBody User user){
        System.out.println("put ==> "+user);
        return "update success!";
    }
    
    // 删除数据
    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Integer id){
        System.out.println("deleteUserById id = "+id);
        return"delete success!";
    }
}
