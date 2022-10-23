package com.zhangsai.springcloud.service;

import com.zhangsai.springcloud.entities.CommonResult;
import com.zhangsai.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.service
 * @ClassName: PaymentFallbackService
 * @author: Mr.Zhang
 * @create: 2022-08-03 15:04
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
