package com.huangc.servicefeign.modules.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: huangl
 * @Date: 2019/7/26 13:45
 * @Description:
 */
@FeignClient("cloud-service")
public interface CloudUserService {

    @RequestMapping(value = "/api/users",method = RequestMethod.GET)
    String getUser();
}
