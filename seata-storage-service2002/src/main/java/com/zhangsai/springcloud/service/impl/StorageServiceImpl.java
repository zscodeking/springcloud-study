package com.zhangsai.springcloud.service.impl;

import com.zhangsai.springcloud.dao.StorageDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zhangsai.springcloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2022
 * @description: 实现类
 * @Packagename: com.zhangsai.springcloud.service.impl
 * @ClassName: StorageServiceImpl
 * @author: Mr.Zhang
 * @create: 2022-08-06 15:57
 */
@Service
public class StorageServiceImpl implements StorageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }

}
