package com.huangc.base.servicelucy.modules.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-hi",fallback = ServiceHiHystrix.class)
public interface ServiceHi {

    @RequestMapping(value = "hi")
    String sayHi(String name);

    @RequestMapping(value = "him")
    String sayHim(String name);
}
