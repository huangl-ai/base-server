package com.huangc.base.studyservice.modules.springbootstudy;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: huangl
 * @Date: 2019/12/19 14:33
 * @Description:
 */
@Configuration
//@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)
public class HelloServiceAutoConfiguration {
}
