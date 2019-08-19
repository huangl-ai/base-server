package com.huangc.serviceribbon.modules.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: huangl
 * @Date: 2019/7/23 18:09
 * @Description:
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
    public String himService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/him?name="+name,String.class);
    }
}
