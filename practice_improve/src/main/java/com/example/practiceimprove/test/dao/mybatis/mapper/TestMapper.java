package com.example.practiceimprove.test.dao.mybatis.mapper;

import com.example.practiceimprove.test.model.TestYr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TestYr queryById(TestYr testYr);
}
