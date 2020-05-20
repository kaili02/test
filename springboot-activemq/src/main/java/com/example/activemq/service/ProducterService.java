package com.example.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;
import javax.jms.Topic;


/**
 * Created By kaili
 * Date: 2020/05/19
 * Description: TODO
 */
@Service
public class ProducterService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;
    @Autowired
    Topic topic;
    public void sendQuenue(String msg){
        jmsTemplate.convertAndSend(queue, msg);
    }

    public void sendTopic(String msg){
        jmsTemplate.convertAndSend(topic, msg);
    }


}
