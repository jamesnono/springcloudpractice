package com.example.practiceimprove;

import com.example.practiceimprove.base.database.DynamicDataSource;
import com.example.practiceimprove.test.dao.mybatis.mapper.TestMapper;
import com.example.practiceimprove.test.model.TestYr;
import com.example.practiceimprove.test.service.TestYrService;
import org.apache.commons.dbcp.BasicDataSource;
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
    @Resource
    TestYr testYr;
    @Resource
    private TestMapper testMapper;
    @Test
    public void contextLoads() {
        TestYr testYr =new TestYr();
        testYr.setId(1L);
        for(int i=0;i<10;i++) {
            System.out.println(testYrService.queryById(testYr).getUsername());
        }
    }

}
