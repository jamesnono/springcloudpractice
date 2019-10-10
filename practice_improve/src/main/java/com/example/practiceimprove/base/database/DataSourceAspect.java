package com.example.practiceimprove.base.database;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ClassName DataSourceAspect
 * @Description TODO
 * @Author yangrui
 * @Date 2019/10/10
 **/
@Component
public class DataSourceAspect {
    public Object changeDataSource(ProceedingJoinPoint point) throws Throwable{
        Object target=point.getTarget();
        String method =point.getSignature().getName();
        Class<?>[] parameterTypes =((MethodSignature)point.getSignature()).getMethod().getParameterTypes();
        try{
            DynamicDataSourceHolder.clearDataSource();
            Method targetMethod =target.getClass().getMethod(method,parameterTypes);
            if(null!=targetMethod&&targetMethod.isAnnotationPresent(DataSource.class)){
                DataSource data=targetMethod.getAnnotation(DataSource.class);
                DynamicDataSourceHolder.putDataSource(data.value().getName());
                System.out.println("++++++++++++>"+data.value().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
             return point.proceed();
        } finally {
            DynamicDataSourceHolder.clearDataSource();
        }
    }

}
