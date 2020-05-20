package com.example.activemq.controller;

import com.example.activemq.service.ProducterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By kaili
 * Date: 2020/05/19
 * Description: TODO
 */
@RestController
@RequestMapping("/mq")
public class MqController {

    @Autowired
    ProducterService producterService;

    @RequestMapping("send")
    public String sendQuenue(String msg){
        producterService.sendQuenue(msg);
        return "send success " + msg;
    }
    @RequestMapping("send2")
    public String sendTopic(String msg){
        producterService.sendTopic(msg);
        return "send success " + msg;
    }
}
