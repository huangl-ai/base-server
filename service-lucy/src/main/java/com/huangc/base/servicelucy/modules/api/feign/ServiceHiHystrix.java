package com.huangc.base.servicelucy.modules.api.feign;

import org.springframework.stereotype.Component;

/**
 * @Auther: huangl
 * @Date: 2019/8/20 15:01
 * @Description:
 */
@Component
public class ServiceHiHystrix implements ServiceHi {
    @Override
    public String sayHi(String name) {
        return "hi error";
    }

    @Override
    public String sayHim(String name) {
        return "him error";
    }
}
