package com.example.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created By kaili
 * Date: 2019/12/11
 * Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KafkaApplication.class})
public class KafkaApplicationTests {

    @Resource
    //注入kafkatemplete，这个由spring boot自动创建
    KafkaTemplate kafkaTemplate;

    @Test
    public void testKafkaSendMsg() {
        //发送消息
        kafkaTemplate.send("test", 0,"0","haha");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
