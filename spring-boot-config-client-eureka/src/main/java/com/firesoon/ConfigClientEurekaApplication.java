package com.firesoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-09-29 10:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApplication.class, args);
    }
}
