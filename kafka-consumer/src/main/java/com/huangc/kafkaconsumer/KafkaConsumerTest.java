package com.huangc.kafkaconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

/**
 * @Description TODO
 * @Author huzp
 * @Data 2019/5/7
 * @Version 1.0
 */
public class KafkaConsumerTest {




    static {
        System.setProperty("java.security.auth.login.config", "D:\\springcloud\\base-server\\kafka-consumer\\src\\main\\resources\\consumer_jaas.conf");
    }


    public static void poll(){
/*        Properties props = new Properties();
        //消息队列IP和端口
        props.put("bootstrap.servers", "172.20.105.209:9092");
        //Kafka集群
        //消费组名
        props.put("group.id", "0001AGroup");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("security.protocol", "SASL_PLAINTEXT");
        props.put("sasl.mechanism", "SCRAM-SHA-256");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        //消息主题
        consumer.subscribe(Arrays.asList("0001ATopic","0001BTopic"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
            }
        }*/
    }
    public static void main(String[] args){


        Properties props = new Properties();
        //消息队列IP和端口
        props.put("bootstrap.servers", "172.20.105.209:9092");
        //Kafka集群
        //消费组名
        props.put("group.id", "InternalPortalGroup");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("security.protocol", "SASL_PLAINTEXT");
        props.put("sasl.mechanism", "SCRAM-SHA-256");


        Thread thread1 = new Thread(()->{
            KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
            //消息主题
            consumer.subscribe(Arrays.asList("InternalPortalTopic"));
            while (true) {
                ConsumerRecords<String, String> records = consumer.poll(100);
                for (ConsumerRecord<String, String> record : records) {
                    System.out.printf("Partition = %d,offset = %d, key = %s, value = %s%n",record.partition(), record.offset(), record.key(), record.value());
                }
            }
        });

/*    Thread thread2 = new Thread(()->{
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        //消息主题
        consumer.subscribe(Arrays.asList("0001BTopic"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
            }
        }
    });*/

    thread1.start();
//    thread2.start();
}
}

