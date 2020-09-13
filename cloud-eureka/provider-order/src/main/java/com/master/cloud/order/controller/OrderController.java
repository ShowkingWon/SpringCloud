package com.master.cloud.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry Wan on 2020/9/7.
 * @description
 * @date 2020-09-07 15:26
 */
@RestController
@RequestMapping("/cloud/api/order")
public class OrderController {

    private final Logger logger = LoggerFactory.getLogger(OrderController.class);

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

        return "Hello Order Index";

    }

}
