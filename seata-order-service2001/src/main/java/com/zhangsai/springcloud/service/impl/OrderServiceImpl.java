package com.zhangsai.springcloud.service.impl;

import com.zhangsai.springcloud.dao.OrderDao;
import com.zhangsai.springcloud.domain.Order;
import com.zhangsai.springcloud.service.AccountService;
import com.zhangsai.springcloud.service.OrderService;
import com.zhangsai.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2022
 * @description: 实现类
 * @Packagename: com.zhangsai.springcloud.service.impl
 * @ClassName: OrderServiceImpl
 * @author: Mr.Zhang
 * @create: 2022-08-03 21:06
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：
     * 下订单->减库存->减余额->改状态
     */
    @Override
    //@GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------->下单开始");
        //本应用创建订单
        orderDao.create(order);

        //远程调用库存服务扣减库存
        log.info("------->订单微服务调用库存微服务，扣减库存开始");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------->订单微服务调用库存微服务，扣减库存结束");

        //远程调用账户服务扣减余额
        log.info("------->订单微服务调用账户微服务，扣减余额开始");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------->订单微服务调用账户微服务，减余额结束");

        //修改订单状态为已完成
        log.info("------->order-service中修改订单状态开始");
        // 这里的话是不是应该是orderId？
        orderDao.update(order.getUserId(), 0);
        log.info("------->order-service中修改订单状态结束");

        log.info("------->下单结束");
    }
}
