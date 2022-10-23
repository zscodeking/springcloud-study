package com.zhangsai.springcloud.controller;

import com.zhangsai.springcloud.domain.CommonResult;
import com.zhangsai.springcloud.domain.Order;
import com.zhangsai.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.controller
 * @ClassName: OrderController
 * @author: Mr.Zhang
 * @create: 2022-08-05 09:50
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }

}
