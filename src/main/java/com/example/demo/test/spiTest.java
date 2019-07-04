package com.example.demo.test;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.example.demo.dubbo.ProviderTest;

/**
 * @auther le
 * @date 2019/7/3 14:10
 */
public class spiTest {

    public static void main(String[] args) {
        ExtensionLoader<ProviderTest> extensionLoader = ExtensionLoader.getExtensionLoader(ProviderTest.class);
        ProviderTest adaptiveExtension = extensionLoader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?provider.test=test2");
        adaptiveExtension.adaptive("你好",url);
    }
}
