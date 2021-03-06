package com.demo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author libohan
 * @date 2019/9/10
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Config_8001_DeptProvider_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_8001_DeptProvider_App.class,args);
    }
}
