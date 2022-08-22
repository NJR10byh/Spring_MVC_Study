package com.migufun.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author NJR10byh
 * @date 2022/8/20 20:03:47
 * @description
 */

public class ServletcontainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return null;
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class[] {SpringMVC_Config.class};
    }
    
    @Override
    protected String[] getServletMappings()
    {
        return new String[] {"/"};
    }
    
    // 中文乱码处理
    @Override
    protected Filter[] getServletFilters()
    {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[] {filter};
    }
}
