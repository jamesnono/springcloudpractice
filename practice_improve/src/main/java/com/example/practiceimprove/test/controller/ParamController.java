package com.example.practiceimprove.test.controller;

import com.example.practiceimprove.test.model.TestYr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName ParamController
 * @Description TODO
 * @Author yangrui
 * @Date 2019/10/9
 **/
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/test")
    public void showParam( TestYr testYr){
         System.out.println(testYr.toString()+"");
    }
}
