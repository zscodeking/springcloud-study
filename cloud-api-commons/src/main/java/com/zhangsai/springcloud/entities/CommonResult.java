package com.zhangsai.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.entities
 * @ClassName: CommonResult
 * @author: Mr.Zhang
 * @create: 2022-07-03 10:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T   data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
