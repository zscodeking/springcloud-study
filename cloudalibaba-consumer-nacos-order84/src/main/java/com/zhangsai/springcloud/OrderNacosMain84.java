package com.zhangsai.springcloud;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud
 * @ClassName: OrderNacosMain84
 * @author: Mr.Zhang
 * @create: 2022-08-03 14:06
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }
}
