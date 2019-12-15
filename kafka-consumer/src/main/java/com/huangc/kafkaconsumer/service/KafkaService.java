package com.huangc.kafkaconsumer.service;

import com.meiin.base.message.KafkaMessage;
import com.meiin.base.message.topic.IKafkaOperate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: huangl
 * @Date: 2019/12/3 09:56
 * @Description:
 */
@Service
public class KafkaService {

    @Autowired
    private IKafkaOperate kafkaOperate;

   public void produceMessage(String topicName,String message){

       kafkaOperate.producerMessage(new KafkaMessage(topicName,message));
   }



}
