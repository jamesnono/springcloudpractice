package com.example.practiceimprove;

import com.example.practiceimprove.test.dao.mybatis.mapper.TestMapper;
import com.example.practiceimprove.test.model.TestYr;
import com.example.practiceimprove.test.service.TestYrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeImproveApplicationTests {

    @Resource
    private TestYrService testYrService;
//    @Resource
//    TestYr testYr;
    @Test
    public void contextLoads() {
        TestYr testYr =new TestYr();
        testYr.setUsername("nono");
        System.out.println(testYrService.queryByName(testYr).getAge());
    }

}
