package com.huangc.base.studyservice.modules.springbootstudy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: huangl
 * @Date: 2019/12/19 14:28
 * @Description:
 */
@ConfigurationProperties(prefix = "service.properties")
@Component
public class HelloServiceProperties {

    private static final String SERVICE_NAME = "test-service";

    private String msg = SERVICE_NAME;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
