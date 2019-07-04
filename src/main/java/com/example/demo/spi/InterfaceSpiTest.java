package com.example.demo.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @auther le
 * @date 2019/6/17 15:38
 */
@SPI("dubbo")
public interface InterfaceSpiTest {

    void sayHello();
}
