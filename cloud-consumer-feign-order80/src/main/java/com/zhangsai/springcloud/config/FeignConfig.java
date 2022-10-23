package com.zhangsai.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2022
 * @description: 配置类
 * @Packagename: com.zhangsai.springcloud.config
 * @ClassName: FeignConfig
 * @author: Mr.Zhang
 * @create: 2022-07-20 21:39
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
