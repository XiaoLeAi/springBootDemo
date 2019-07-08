package com.example.demo.spi.impl;

import com.example.demo.spi.InterfaceSpiTest;

/**
 * @auther le
 * @date 2019/6/17 15:53
 */
public class interfaceSpiTestImpl implements InterfaceSpiTest {
    @Override
    public void sayHello() {
        System.out.println(interfaceSpiTestImpl.class.getName()+": say hello!");
    }
}
