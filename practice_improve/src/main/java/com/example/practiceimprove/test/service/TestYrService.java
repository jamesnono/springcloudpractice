package com.example.practiceimprove.test.service;

import com.example.practiceimprove.test.model.TestYr;

public interface TestYrService {

    public TestYr queryById(TestYr testYr);

    public TestYr queryByName(TestYr testYr);
}
