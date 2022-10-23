package com.zhangsai.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.config
 * @ClassName: MyBatisConfig
 * @author: Mr.Zhang
 * @create: 2022-08-05 09:52
 */
@Configuration
@MapperScan("com.zhangsai.springcloud.dao")
public class MyBatisConfig {
}
