package com.huangc.servicefeign.modules.api.feign;

import com.huangc.servicefeign.modules.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "${cloud.api}",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "${cloud.apim}",method = RequestMethod.GET)
    String sayHiFromClientTwo(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hime",method = RequestMethod.GET)
    Result sayHiFromClientTwoe(@RequestParam(value = "name") String name);
}