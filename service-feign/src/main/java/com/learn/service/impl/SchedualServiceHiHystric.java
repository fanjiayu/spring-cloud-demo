package com.learn.service.impl;

import com.learn.service.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by LEJU on 2017/12/4.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }
}
