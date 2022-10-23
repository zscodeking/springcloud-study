package com.zhangsai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2022
 * @description: 主启动类
 * @Packagename: com.zhangsai.springcloud
 * @ClassName: PaymentMain9001
 * @author: Mr.Zhang
 * @create: 2022-07-30 16:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9001.class, args);
    }
}
