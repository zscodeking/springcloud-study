package com.zhangsai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2022
 * @description: 主启动类
 * @Packagename: com.zhangsai.springcloud
 * @ClassName: MainApp8401
 * @author: Mr.Zhang
 * @create: 2022-08-01 10:04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp8401.class,args);
    }
}
