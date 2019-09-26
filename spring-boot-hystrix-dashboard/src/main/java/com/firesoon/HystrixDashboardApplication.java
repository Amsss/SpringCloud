package com.firesoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @description:
 *  1. 访问http://localhost:8030/hystrix.stream 可以查看Dashboard
 *  2. 在上面的输入框填入: http://想监控的服务:端口/hystrix.stream进行测试
 *  注意：首先要先调用一下想监控的服务的API，否则将会显示一个空的图表.
 * @author: zhuzz
 * @date: 2019-09-26 17:02
 */
@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
