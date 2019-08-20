package com.huangc.servicefeign.modules.api.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: huangl
 * @Date: 2019/8/19 15:33
 * @Description:
 */
public interface HiService {

    String sayHiFromClientOne(String name);

    String sayHiFromClientTwo(String name);
}
