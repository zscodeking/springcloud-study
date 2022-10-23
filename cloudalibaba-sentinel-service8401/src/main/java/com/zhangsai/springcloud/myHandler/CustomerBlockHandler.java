package com.zhangsai.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zhangsai.springcloud.entities.CommonResult;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.myHandler
 * @ClassName: CustomerBlockHandler
 * @author: Mr.Zhang
 * @create: 2022-08-03 13:37
 */
public class CustomerBlockHandler {

    public static CommonResult handleException1(BlockException exception){
        return new CommonResult(444,"按照客户自定义，global handlerException----1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(444,"按照客户自定义，global handlerException----2");
    }
}
