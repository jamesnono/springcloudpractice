package com.example.practiceimprove.test.service;

import com.example.practiceimprove.test.dao.mybatis.mapper.TestMapper;
import com.example.practiceimprove.test.model.TestYr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName TestYrServiceImpl
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/26
 **/
@Service
public class TestYrServiceImpl implements TestYrService{

    @Resource
    private TestMapper testMapper;

    @Override
    public TestYr queryById(TestYr testYr) {
        return testMapper.queryById(testYr);
    }

    @Override
    public TestYr queryByName(TestYr testYr) {
        return testMapper.queryByName(testYr);
    }
}
