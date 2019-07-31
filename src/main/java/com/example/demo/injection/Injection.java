package com.example.demo.injection;

import com.alibaba.dubbo.common.URL;
import com.example.demo.dubbo.ProviderTest;
import com.example.demo.strategy.Strategy;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther le
 * @date 2019/7/31 9:15
 */
@RestController
@RequestMapping("test/")
public class Injection {

    private final List<InterfaceInjection> strategy;


    public Injection(List<InterfaceInjection> strategy) {
        this.strategy = strategy;
    }

    @RequestMapping("re")
    public String test() {
        return "";
    }

}
