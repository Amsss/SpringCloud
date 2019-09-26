package com.firesoon.springboothello.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.logging.Logger;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019/8/8 15:26
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger("HelloController");

    @Autowired
    private DiscoveryClient client;

    @Qualifier("eurekaRegistration")
    @Autowired
    private Registration registration;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(String name) {
        client.getInstances("hello-service");
        List<ServiceInstance> instance = client.getInstances(registration.getServiceId());
        logger.info("/hello, host:" + instance.get(0).getHost() + ", service_id:" + instance.get(0).getServiceId());
        System.out.print(name);
        return "Hello World" + name;
    }
}
