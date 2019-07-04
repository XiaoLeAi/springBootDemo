package com.example.demo.strategy.interfaces.impl;

import com.example.demo.strategy.interfaces.ContractStrategy;
import org.springframework.stereotype.Service;

/**
 * @auther le
 * @date 2019/4/3 16:28
 */
@Service("ewq")
public class ContractStrategy2 implements ContractStrategy {
    @Override
    public String build() {
        System.out.println("策略2");
        return null;
    }
}
