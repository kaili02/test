package com.example.activemq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created By kaili
 * Date: 2020/05/19
 * Description: mq消费者，queue队列只能单消费，发布于订阅的方式，可以多消费
 */
@Service
public class ConsumerService {
    Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * 监听和接收 队列，消息
     */
    @JmsListener(destination = "springboot.mq")
    public void readActiveMq(String msg){
        logger.info("接收到消息：{}", msg );
    }

    /**
     * 监听和接收 队列，消息
     */
    @JmsListener(destination = "springboot.topic")
    public void readActiveTopic(String msg){
        logger.info("topic 接收到消息：{}" , msg );
    }

    /**
     * 监听和接收 队列，消息
     */
    @JmsListener(destination = "springboot.topic")
    public void readActiveTopic2(String msg){
        logger.info("topic2 接收到消息：{}",  msg );
    }
}
