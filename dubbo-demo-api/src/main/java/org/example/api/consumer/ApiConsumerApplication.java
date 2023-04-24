package org.example.api.consumer;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.example.api.service.DemoService;

import java.io.IOException;

public class ApiConsumerApplication {
    public static void main(String[] args) throws IOException {
        ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setInterface(DemoService.class);

        DubboBootstrap.getInstance()
                .application("dubbo-demo-api-consumer")
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .reference(referenceConfig)
                .start();

        DemoService demoService = referenceConfig.get();
        String result = demoService.sayHello("dubbo");
        System.out.println("dubbo调用结果:" + result);
        System.in.read();
    }
}
