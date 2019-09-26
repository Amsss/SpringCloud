package com.firesoon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-09-26 20:46
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
