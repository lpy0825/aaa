package com.aaa.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webConfig implements WebMvcConfigurer
{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/image/**").addResourceLocations("file:/G:\\RadioFM\\src\\main\\resources\\static\\image/");
        registry.addResourceHandler("/img/**").addResourceLocations("file:/G:\\RadioFM\\src\\main\\resources\\static\\img/");
    }
}
