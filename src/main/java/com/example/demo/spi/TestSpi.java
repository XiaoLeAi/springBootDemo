package com.example.demo.spi;


import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @auther le
 * @date 2019/6/17 15:56
 */
public class TestSpi {

    public static void main(String[] args) {
        ServiceLoader<InterfaceSpiTest> spiLoader = ServiceLoader.load(InterfaceSpiTest.class);
        Iterator<InterfaceSpiTest> iteratorSpi=spiLoader.iterator();
        while (iteratorSpi.hasNext()){
            InterfaceSpiTest interfaceSpiTest=iteratorSpi.next();
            interfaceSpiTest.sayHello();
        }
    }
}
