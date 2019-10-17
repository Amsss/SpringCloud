package com.firesoon.exception;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: 这边采取了和Spring Cloud官方文档相同的做法，将fallback类作为内部类放入Feign的接口中，当然也可以单独写一个fallback类。
 * @author: zhuzz
 * @date: 2019-09-26 15:58
 */
public class HystrixClientFallback implements FallbackFactory<String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

    @Override
    public String create(Throwable throwable) {
        System.out.println("发生异常");
        return "发生异常";
    }
}
