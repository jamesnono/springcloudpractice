package com.example.practiceimprove;

import com.example.practiceimprove.test.dao.mybatis.mapper.TestMapper;
import com.example.practiceimprove.test.model.TestYr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeImproveApplicationTests {

    @Resource
    private TestMapper testMapper;
//    @Resource
//    TestYr testYr;
    @Test
    public void contextLoads() {
        TestYr testYr =new TestYr();
        testYr.setId(1L);
        System.out.println(testMapper.queryById(testYr).getUsername());
    }

}
