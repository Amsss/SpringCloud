package com.firesoon.services.common.impl;

import com.firesoon.services.common.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-09-24 19:27
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String say(String id) {
        // http://服务提供者的serviceId/url
        return restTemplate.getForObject("http://HELLO-SERVICE/hello?name=" + id, String.class);
    }
}
