package com.huangc.kafkaconsumer.config;

import com.huangc.kafkaconsumer.module.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: huangl
 * @Date: 2019/12/4 09:52
 * @Description:
 */
@Configuration
public class TestConfig {

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }
}
