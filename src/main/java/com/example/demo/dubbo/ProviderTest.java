package com.example.demo.dubbo;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * @auther le
 * @date 2019/7/3 11:33
 */
@SPI("test1")
public interface ProviderTest {

    @Adaptive
    void adaptive(String s, URL url);
}
