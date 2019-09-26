package com.example.practiceimprovecopy.test.dao.mybatis.mapper;

import com.example.practiceimprovecopy.test.model.TestYr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TestYr queryById(TestYr testYr);
}
