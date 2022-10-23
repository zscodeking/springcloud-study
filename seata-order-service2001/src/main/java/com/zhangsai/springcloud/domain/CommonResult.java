package com.zhangsai.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.domain
 * @ClassName: CommonResult
 * @author: Mr.Zhang
 * @create: 2022-08-03 20:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }

}
