package com.zhangsai.springcloud.controller;

import com.zhangsai.springcloud.domain.CommonResult;
import com.zhangsai.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.controller
 * @ClassName: StorageController
 * @author: Mr.Zhang
 * @create: 2022-08-06 15:59
 */
@RestController
public class StorageController {
    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }

}
