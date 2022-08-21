package com.migufun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author NJR10byh
 * @date 2022/8/20 19:58:11
 * @description
 */

// 2、创建SpringMVC控制类（相当于servlet）

@Controller
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/save")
    @ResponseBody
    public String save()
    {
        System.out.println("user save...");
        return "{'module':'user save...'}";
    }
}
