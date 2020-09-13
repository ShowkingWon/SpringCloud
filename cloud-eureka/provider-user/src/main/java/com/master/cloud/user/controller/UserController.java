package com.master.cloud.user.controller;

/**
 * @author Jerry Wan on 2020/9/7.
 * @description
 * @date 2020-09-07 15:16
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务.
 *
 * @author Jerry Wan on 2020/9/7.
 * @description
 * @date 2020-09-07 11:41
 */

@RestController
@RequestMapping("/cloud/api/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private DiscoveryClient client;

    /**
     * 用户首页.
     *
     * @description .
     * @author Jerry Wan
     * @date 2020/9/7 11:42
     */
    @GetMapping("/index")
    public String index() {

        return "Hello User Index";

    }

}

