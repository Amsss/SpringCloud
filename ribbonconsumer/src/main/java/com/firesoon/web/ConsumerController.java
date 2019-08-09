package com.firesoon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * @Author: ZhuZeZhao
 * @Description:
 * @Date: Create in 20:17 2018/4/30
 * @Modified By:
 */
@RestController
public class ConsumerController {

    private final Logger logger = Logger.getLogger("ConsumerController");
    @Autowired
    RestTemplate restTemplate;

    @Value("${book.name}")
    private String name;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
}