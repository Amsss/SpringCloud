package com.firesoon.clinet;

import com.firesoon.exception.ExceptionHandle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个URL。
 * @author: zhuzz
 * @date: 2019-09-26 15:34
 */
@FeignClient(name = "HELLO-SERVICE", fallbackFactory = ExceptionHandle.class)
public interface CommonFeignClient {

    @RequestMapping("/hello")
    String say(@RequestParam("name") String id);
}
