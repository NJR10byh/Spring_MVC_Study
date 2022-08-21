package com.migufun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author NJR10byh
 * @date 2022/8/21 17:35:40
 * @description
 */

@Controller
@RequestMapping("/book")
public class BookController
{
    @RequestMapping("/save")
    @ResponseBody
    public String save()
    {
        System.out.println("book save...");
        return "{'module':'book save...'}";
    }
}
