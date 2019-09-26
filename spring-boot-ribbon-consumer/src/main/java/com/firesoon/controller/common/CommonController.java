package com.firesoon.controller.common;

import com.firesoon.services.common.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-09-24 19:29
 */
@RestController
public class CommonController {

    @Autowired
    private CommonService commonService;

    @GetMapping("/ribbon/{id}")
    public String findById(@PathVariable String id) {
        return commonService.say(id);
    }
}
