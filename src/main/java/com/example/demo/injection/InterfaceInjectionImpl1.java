package com.example.demo.injection;

import org.springframework.stereotype.Component;

/**
 * @auther le
 * @date 2019/7/31 13:53
 */
@Component
public class InterfaceInjectionImpl1 implements InterfaceInjection {
    @Override
    public String test() {
        return "impl1 success!";
    }
}
