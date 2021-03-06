package com.example.practiceimprove.test.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @ClassName test
 * @Description TODO
 * @Author yangrui
 * @Date 2019/8/29
 **/
@Component
//@ConfigurationProperties(prefix="book")
public class TestYr implements Serializable {

    private String test;

    private String username;

    private Long id;

    private Long age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString(){
        StringBuffer sb =new StringBuffer("TestYr:--");
        sb.append("test:"+test);
        sb.append("username:"+username);
        sb.append("id:"+id);
        sb.append("age:"+age);
        return sb.toString();
    }
}
