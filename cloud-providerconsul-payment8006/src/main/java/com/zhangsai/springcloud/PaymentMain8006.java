package com.zhangsai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2022
 * @description: 主启动类
 * @Packagename: com.zhangsai.springcloud
 * @ClassName: PaymentMain8006
 * @author: Mr.Zhang
 * @create: 2022-07-13 18:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class, args);
    }
}
