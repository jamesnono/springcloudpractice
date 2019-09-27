package com.example.practiceimprove.test.controller;

import com.example.practiceimprove.test.model.TestYr;
import com.example.practiceimprove.test.service.TestYrService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * @ClassName LicenseController
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/19
 **/
@RestController
@RequestMapping("/hello")
public class LicenseController {

    @Resource
    private TestYrService testYrService;

    @RequestMapping("/test111")
    public String license(@RequestParam("name") String name)throws Exception{
        Random rand =new Random();
        int randNum =rand.nextInt((2+1))+1;
//        if(true) {
//            try{
//                sleep(3000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
        TestYr testYr= new TestYr();
        testYr.setUsername(name);
        return "hello"+testYrService.queryByName(testYr).getAge()+"improve";
    }
}
