package com.firesoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:  开启eureka服务
 * @author: zhuzz
 * @date: 2019/8/8 14:47
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
	}
}
