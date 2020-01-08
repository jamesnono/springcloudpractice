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
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeImproveApplicationTests {

    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void contextLoads() {
        TestYr testYr = new TestYr();
        testYr.setTest("Test");
        testYr.setId(1L);
        testYr.setAge(22L);
        String key = String.format("testYr:%d",testYr.getId());
        redisTemplate.opsForValue().set(key,testYr);
        System.out.println(redisTemplate.opsForValue().get(key));
        System.out.println(redisTemplate==stringRedisTemplate);
    }
}
