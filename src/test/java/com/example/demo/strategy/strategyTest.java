package com.example.demo.strategy;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @auther le
 * @date 2019/4/3 16:32
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class strategyTest {

    @Autowired
    private Strategy strategy;

    @Test
    public void buildContract() {

        strategy.buildContract("2");
    }
}