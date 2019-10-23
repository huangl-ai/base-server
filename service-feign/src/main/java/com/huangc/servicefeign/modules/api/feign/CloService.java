package com.huangc.servicefeign.modules.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("CloudService")
public interface CloService {

    @RequestMapping(value = "/aa",method = RequestMethod.GET)
    Object getUser(@RequestParam String id);
}
