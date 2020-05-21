package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created By kaili
 * Date: 2019/10/16
 * Description: TODO
 */
@EnableAsync  //可使用@Asyns
@EnableScheduling //可使用自定时任务
@SpringBootApplication(scanBasePackages = "com.example.kafka")
public class KafkaApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(KafkaApplication.class);
    }
}
