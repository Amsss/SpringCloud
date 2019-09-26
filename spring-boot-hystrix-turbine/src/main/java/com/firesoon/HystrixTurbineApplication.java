package com.firesoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @description: 通过@EnableTurbine接口，激活对Turbine的支持。
 * @author: zhuzz
 * @date: 2019-09-26 17:25
 */
@SpringBootApplication
@EnableTurbine
public class HystrixTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineApplication.class, args);
    }
}
