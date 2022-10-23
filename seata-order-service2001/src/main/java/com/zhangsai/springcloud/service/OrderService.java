package com.zhangsai.springcloud.service;

import com.zhangsai.springcloud.domain.Order;

public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);

}
