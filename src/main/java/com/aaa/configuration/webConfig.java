package com.aaa.configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class webConfig implements WebMvcConfigurer
{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/image/**").addResourceLocations("G:/RadioFM/src/main/resources/static/image/");
    }
}
