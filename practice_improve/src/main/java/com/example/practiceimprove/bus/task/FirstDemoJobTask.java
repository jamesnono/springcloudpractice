package com.example.practiceimprove.bus.task;

import com.example.practiceimprove.test.model.TestYr;
import com.example.practiceimprove.test.service.TestYrService;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * xxl-job搭建测试方法
 * @author 杨锐
 * @date 2020-01-06 20:40:31
 **/
@Component
@JobHandler(value ="firstDemoTask")
public class FirstDemoJobTask extends IJobHandler {
    @Resource
    TestYrService testYrService;

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>> xxl-job test <<<<<<<<<<<<<<<<<");
        TestYr testYr = new TestYr();
        testYr.setId(1L);
        TestYr testYr1 = testYrService.queryById(testYr);
        System.out.println(testYr1.getUsername());
        return ReturnT.SUCCESS;
    }
}
