package com.example.practiceimprove.test.controller;

import com.example.practiceimprove.test.model.TestYr;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/17
 **/
@Controller
@RequestMapping("/demo/{idone}")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/test/{idtwo}")
    public String test(@PathVariable("idone") int idone, @PathVariable("idtwo") int idtwo) {
        return "idone" + idone + "idtwo" + idtwo;
    }

}
