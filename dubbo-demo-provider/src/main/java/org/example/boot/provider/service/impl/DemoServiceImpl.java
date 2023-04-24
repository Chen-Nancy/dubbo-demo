package org.example.boot.provider.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.boot.api.service.DemoService;
import org.springframework.stereotype.Service;

@DubboService
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("调用DemoService.sayHello,参数:" + name);
        return "hello," + name + "!";
    }
}
