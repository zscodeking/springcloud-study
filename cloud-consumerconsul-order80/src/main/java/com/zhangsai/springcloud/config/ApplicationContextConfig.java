package com.zhangsai.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2022
 * @description: 配置类
 * @Packagename: com.zhangsai.springcloud.config
 * @ClassName: ApplicationContextConfig
 * @author: Mr.Zhang
 * @create: 2022-07-09 18:15
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
