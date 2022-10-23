package com.zhangsai.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2022
 * @description: 配置类引入RestTemplate
 * @Packagename: com.zhangsai.springcloud.config
 * @ClassName: ApplicationContextBean
 * @author: Mr.Zhang
 * @create: 2022-07-30 16:50
 */
@Configuration
public class ApplicationContextBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
