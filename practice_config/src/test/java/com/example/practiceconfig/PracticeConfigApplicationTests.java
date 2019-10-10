package com.example.practiceconfig;

import com.example.practiceconfig.properties.Properties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeConfigApplicationTests {

    @Resource
    private Properties properties;
    @Test
    public void contextLoads() {
        List<String> list=properties.getServers();
        System.out.println(list.toString());
    }

}
