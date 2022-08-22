package com.migufun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author NJR10byh
 * @date 2022/8/20 20:01:41
 * @description
 */

// 3、初始化SpringMVC环境，设定SpringMVC加载对应的Bean
@Configuration
@ComponentScan("com.migufun.controller")
@EnableWebMvc
public class SpringMVC_Config
{
}
