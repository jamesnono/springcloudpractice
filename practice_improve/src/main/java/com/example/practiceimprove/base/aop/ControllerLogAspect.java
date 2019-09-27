package com.example.practiceimprove.base.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName LogAspect
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/26
 **/
@Component
@Aspect
public class ControllerLogAspect {

    @Pointcut("execution(public * com.example.practiceimprove.test.service.*.*(..))")
    public void testPointCut(){}

    @Before("testPointCut()")
    public void before (JoinPoint joinPoint){
        System.out.println("=====================前置通知=====================");
    }
}
