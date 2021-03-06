package com.example.demo.strategy;

import com.example.demo.strategy.interfaces.ContractStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther le
 * @date 2019/4/3 16:24
 */
@Component
public class Strategy {

    @Autowired
    private Map<String , ContractStrategy> map = new HashMap();
    @Autowired
    private List<ContractStrategy> c = new ArrayList<>();

    public Object buildContract(String str){
        return this.map.get(str);
    }
}
