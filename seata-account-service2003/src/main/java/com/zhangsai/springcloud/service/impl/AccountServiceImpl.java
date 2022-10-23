package com.zhangsai.springcloud.service.impl;

import com.zhangsai.springcloud.dao.AccountDao;
import com.zhangsai.springcloud.service.AccountService;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @program: cloud2022
 * @description: 实现类
 * @Packagename: com.zhangsai.springcloud.service.impl
 * @ClassName: AccountServiceImpl
 * @author: Mr.Zhang
 * @create: 2022-08-06 16:17
 */
@Service
public class AccountServiceImpl implements AccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Resource
    AccountDao accountDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        //try { TimeUnit.SECONDS.sleep(30); } catch (InterruptedException e) { e.printStackTrace(); }
        accountDao.decrease(userId, money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }

}
