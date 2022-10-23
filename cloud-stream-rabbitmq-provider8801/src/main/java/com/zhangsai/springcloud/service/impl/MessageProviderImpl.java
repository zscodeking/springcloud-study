package com.zhangsai.springcloud.service.impl;

import com.zhangsai.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @program: cloud2022
 * @description:
 * @Packagename: com.zhangsai.springcloud.service.impl
 * @ClassName: MessageProviderImpl
 * @author: Mr.Zhang
 * @create: 2022-07-29 14:41
 */
@EnableBinding(Source.class) //定义消息推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;  //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build()); //创建并发送消息
        System.out.println("***serial: "+serial);
        return serial;
    }
}
