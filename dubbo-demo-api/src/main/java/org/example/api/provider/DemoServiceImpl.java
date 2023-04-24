package org.example.api.provider;

import org.example.api.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello," + name + "!";
    }
}
