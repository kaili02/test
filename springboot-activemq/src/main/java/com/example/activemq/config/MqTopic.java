package com.example.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * Created By kaili
 * Date: 2020/05/19
 * Description: TODO
 */
@Component
public class MqTopic {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("springboot.mq");
    }
    @Bean
    public Topic topic(){
        return new ActiveMQTopic("springboot.topic");
    }
}
