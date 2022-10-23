package com.zhangsai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: cloud2022
 * @description: 主启动类
 * @Packagename: com.zhangsai.springcloud
 * @ClassName: HystrixDashboardMain9001
 * @author: Mr.Zhang
 * @create: 2022-07-23 16:21
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}
