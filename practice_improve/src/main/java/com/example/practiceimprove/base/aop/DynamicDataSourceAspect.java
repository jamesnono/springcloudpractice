package com.example.practiceimprove.base.aop;

import com.example.practiceimprove.base.database.DataSourceAspect;
import com.example.practiceimprove.test.model.TestYr;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName DynamicDataSourceAspect
 * @Description TODO
 * @Author yangrui
 * @Date 2019/10/10
 **/
@Component
@Aspect
public class DynamicDataSourceAspect {

    @Resource
    private DataSourceAspect dataSourceAspect;

    @Pointcut("execution(* com.example.practiceimprove..service..*.*(..))")
    public void queryFromDataBase(){
    }

    @Around("queryFromDataBase()")
    public TestYr dynamicDataSourceAspect(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        TestYr obj= (TestYr) dataSourceAspect.changeDataSource(joinPoint);
        return obj;
    }
}
