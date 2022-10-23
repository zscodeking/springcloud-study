package com.zhangsai.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2022
 * @description: 提供者实体类
 * @Packagename: com.zhangsai.springcloud.entities
 * @ClassName: Payment
 * @author: Mr.Zhang
 * @create: 2022-07-03 10:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}