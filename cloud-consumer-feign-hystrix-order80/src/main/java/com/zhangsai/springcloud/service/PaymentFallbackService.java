package com.zhangsai.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud2022
 * @description: 实现接口
 * @Packagename: com.zhangsai.springcloud.service
 * @ClassName: PaymentFallbackService
 * @author: Mr.Zhang
 * @create: 2022-07-23 09:53
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--PaymentFallbackService fall back-paymentInfo_OK,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--PaymentFallbackService fall back-paymentInfo_TimeOut,/(ㄒoㄒ)/~~";
    }
}
