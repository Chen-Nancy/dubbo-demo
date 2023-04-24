package org.example.xml.consumer;

import org.example.xml.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class XmlConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-demo-xml-consumer.xml");
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String result = demoService.sayHello("dubbo");
        System.out.println("dubbo调用结果:" + result);
        System.in.read();
    }
}
