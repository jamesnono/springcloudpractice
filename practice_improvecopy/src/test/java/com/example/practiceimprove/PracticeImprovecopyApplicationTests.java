package com.example.practiceimprove;

import com.example.practiceimprovecopy.test.dao.mybatis.mapper.TestMapper;
import com.example.practiceimprovecopy.test.model.TestYr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeImprovecopyApplicationTests {

    @Resource
    private TestMapper testMapper;
    @Resource
    TestYr testYr;
    @Test
    public void contextLoads() {
        System.out.println(testYr.getTest());
    }

}
