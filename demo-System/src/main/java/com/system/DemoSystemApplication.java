package com.system;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@NacosPropertySource(dataId = "demo-system", autoRefreshed = true)
public class DemoSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSystemApplication.class, args);
    }

}
