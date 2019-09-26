package com.example.practiceconsumer.controller;

import com.example.practiceconsumer.feign.LicenseRemote;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/20
 **/
@RestController
@RequestMapping("/hello1111")
public class HelloController {

    @Resource
    private LicenseRemote licenseRemote;


    @RequestMapping("/test/{name}")
    public String hello(@PathVariable("name") String name){
        return licenseRemote.license(name);
    }
}
