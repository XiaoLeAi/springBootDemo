package com.example.demo.dubbo.impl;

import com.alibaba.dubbo.common.URL;
import com.example.demo.dubbo.ProviderTest;

/**
 * @auther le
 * @date 2019/7/3 11:36
 */
public class ProviderTestImpl2 implements ProviderTest {

    @Override
    public void adaptive(String s, URL url) {
        System.out.println(this.getClass().getName() + "执行了"+s);
    }
}
