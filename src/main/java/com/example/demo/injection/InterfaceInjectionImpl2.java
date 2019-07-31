package com.example.demo.injection;

import org.springframework.stereotype.Component;

/**
 * @auther le
 * @date 2019/7/31 13:55
 */
@Component
public class InterfaceInjectionImpl2 implements InterfaceInjection {
    @Override
    public String test() {
        return "impl2 success!";
    }
}
