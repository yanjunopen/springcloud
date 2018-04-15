package com.yanjun;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/4/7 0007.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}