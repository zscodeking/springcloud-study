package com.zhangsai.springcloud.domain;

import lombok.Data;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.domain
 * @ClassName: Storage
 * @author: Mr.Zhang
 * @create: 2022-08-06 15:54
 */
@Data
public class Storage {private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

