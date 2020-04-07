package com.example.accdemo.service;

import com.example.accstarter.service.AccService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoService implements InitializingBean {

    @Autowired
    private AccService accService;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(accService.getInfo());
    }
}
