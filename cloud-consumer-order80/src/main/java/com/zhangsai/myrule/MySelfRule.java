package com.zhangsai.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.myrule
 * @ClassName: MySelfRule
 * @author: Mr.Zhang
 * @create: 2022-07-17 17:54
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机
    }
}
