package com.example.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created By kaili
 * Date: 2019/12/11
 * Description: TODO
 */
@Component
@Slf4j
public class TimeTask {
    @Autowired
    //注入kafkatemplete，这个由spring boot自动创建
    KafkaTemplate kafkaTemplate;

    @Scheduled(cron = "0/2 * * * * *")
    public void testKafkaSendMsg() {
        kafkaTemplate.send("test","0","haha:"+System.currentTimeMillis());
    }
}
