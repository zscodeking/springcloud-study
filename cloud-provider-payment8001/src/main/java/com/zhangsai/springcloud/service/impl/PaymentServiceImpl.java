package com.zhangsai.springcloud.service.impl;

import com.zhangsai.springcloud.dao.PaymentDao;
import com.zhangsai.springcloud.entities.Payment;
import com.zhangsai.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2022
 * @description: 实现类
 * @Packagename: com.zhangsai.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @author: Mr.Zhang
 * @create: 2022-07-02 17:42
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
