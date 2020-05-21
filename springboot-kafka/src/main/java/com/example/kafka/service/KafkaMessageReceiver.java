package com.example.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created By kaili
 * Date: 2019/12/11
 * Description: TODO
 */
@Component
@Slf4j
public class KafkaMessageReceiver {
    //指定监听的topic，当前消费者组id
    @KafkaListener(topics = {"test"}, groupId = "receiver")
    public void registryReceiver(ConsumerRecord<String, String> consumerRecords) {
        log.info("-----------"+consumerRecords.value());
    }
}