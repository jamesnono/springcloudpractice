package com.example.practiceeureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeEurekaApplicationTests {

        @Test
        public void contextLoads() throws Exception {
            System.out.print(" " + caculateRate(3L,5L));
            System.out.print(" " + caculateRate(5L,3L));
            System.out.print(" " + caculateRate(1L,100L));
            System.out.print(" " + caculateRate(1000L,3L));

        }

    public String caculateRate(long yesterdayDate, long beforeYesterdayDate) {
        long number1 = (yesterdayDate - beforeYesterdayDate) * 100;
        double number2 = number1 / (double)beforeYesterdayDate;
        String s1 = "";
        DecimalFormat df = new DecimalFormat("######0.00");
        String s = df.format(number2);

        String[] num = s.split("\\.");
        if (num[1].charAt(0) == '0' && num[1].charAt(1) == '0') {
            s1 = num[0];
        } else if (num[1].charAt(0) != '0' && num[1].charAt(1) == '0') {
            s1 = num[0] + '.' + num[1].charAt(0);
        } else {
            s1 = s;
        }
        return s1;
    }
}



