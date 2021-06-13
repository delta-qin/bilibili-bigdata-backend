package com.deltaqin.bilibili;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.spring.web.SpringfoxWebMvcConfiguration;

/**
 * @author deltaqin
 * @date 2021/6/11 下午4:07
 */
@ConditionalOnClass(SpringfoxWebMvcConfiguration.class)
@SpringBootApplication
@MapperScan("com.deltaqin.bilibili.dao")
public class BiliApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(BiliApplication.class, args);
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        // https://blog.csdn.net/qq_38380025/article/details/84936466
        // 解决找不到图标，添加一个资源处理器来处理文件和位置的映射
        registry.addResourceHandler("/favicon.ico").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
