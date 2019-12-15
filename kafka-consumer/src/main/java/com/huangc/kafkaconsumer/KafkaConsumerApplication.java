package com.huangc.kafkaconsumer;

import com.huangc.kafkaconsumer.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.huangc")
@RestController
public class KafkaConsumerApplication {

    @Autowired
    private KafkaService kafkaService;

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
    }

    @RequestMapping("api")
    @ResponseBody
    public String init(){

        for (int i=0;i<10;i++){
            System.out.println("i =="+ i);
            kafkaService.produceMessage("InternalPortalTopic","InternalPortalTopic Message "+i);
        }

        return "1234";
    }

}
