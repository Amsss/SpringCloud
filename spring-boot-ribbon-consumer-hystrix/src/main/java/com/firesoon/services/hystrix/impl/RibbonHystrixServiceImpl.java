package com.firesoon.services.hystrix.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-09-26 16:45
 */
@Service
public class RibbonHystrixServiceImpl {
    @Autowired
    private RestTemplate restTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixServiceImpl.class);

    /**
     * 使用@HystrixCommand注解指定当该方法发生异常时调用的方法
     *
     * @param id id
     * @return 通过id查询到的用户
     */
    @HystrixCommand(fallbackMethod = "fallback")
    public String findById(String id) {
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, String.class);
    }

    /**
     * hystrix fallback方法
     *
     * @param id id
     * @return 默认的用户
     */
    public String fallback(String id) {
        LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
        return "";
    }
}
