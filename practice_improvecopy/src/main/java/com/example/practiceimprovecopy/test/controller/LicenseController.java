package com.example.practiceimprovecopy.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LicenseController
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/19
 **/
@RestController
@RequestMapping("/hello")
public class LicenseController {

    @RequestMapping("/test111")
    public String license(@RequestParam("name") String name){
        return "hello"+name+"improvecopy";
    }
}
