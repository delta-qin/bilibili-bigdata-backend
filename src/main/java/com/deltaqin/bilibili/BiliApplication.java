package com.deltaqin.bilibili;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author deltaqin
 * @date 2021/6/11 下午4:07
 */
@SpringBootApplication
@MapperScan("com.deltaqin.bilibili.dao")
public class BiliApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(BiliApplication.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }
}
