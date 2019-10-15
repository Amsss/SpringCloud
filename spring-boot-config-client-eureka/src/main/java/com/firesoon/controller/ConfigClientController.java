package com.firesoon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 这边的@RefreshScope注解不能少，否则即使调用/refresh，配置也不会刷新
 * 本文的bootstrap.yml文件中的内容不能放到application.yml中
 * ，否则config部分无法被加载，因为config部分的配置先于application.yml被加载
 * ，而bootstrap.yml中的配置会先于application.yml加载，
 * @author: zhuzz
 * @date: 2019-09-29 10:33
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/hello")
    public String hello() {
        return this.profile;
    }
}
