package com.example.demo.strategy.interfaces.impl;

import com.example.demo.strategy.interfaces.ContractStrategy;
import org.springframework.stereotype.Service;

/**
 * @auther le
 * @date 2019/4/3 16:28
 */
@Service("qwe")
public class ContractStrategy1 implements ContractStrategy {
    @Override
    public String build() {
        System.out.println("策略1");
        return null;
    }
}
