package org.example.xml.provider;

import org.example.xml.service.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello," + name + "!";
    }
}
