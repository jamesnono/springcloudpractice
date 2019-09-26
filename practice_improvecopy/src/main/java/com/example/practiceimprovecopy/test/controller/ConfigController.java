package com.example.practiceimprovecopy.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/19
 **/
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${test}")
    private String dev;

    @RequestMapping("/test")
    public String testConfig(){
        return this.dev;
    }
}
