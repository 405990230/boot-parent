package com.myself.platform.web.controller;

import com.myself.platform.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tongshan.Han@partner.bmw.com
 * @Description:
 * @date 2018/8/30 17:22
 */
@Slf4j
@RestController
@PropertySource(value = {"classpath:properties/redis.properties"})
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RedisService redisService;

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private Integer port;

    @Value("${spring.redis.password}")
    private String password;

    @GetMapping("/list")
    public String getProperties() {
        log.info("=======================>host:" + host);
        log.info("=======================>port:" + port);
        log.info("=======================>password:" + password);
        redisService.set("3213", 1213, 900l);
        return "host:" + host + ",port:" + port + ",password:" + password;
    }


}
