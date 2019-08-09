package com.huangc.configclient.modules.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huangl
 * @Date: 2019/8/9 15:08
 * @Description:
 */
@RestController
@RefreshScope
public class ApiController {

    @Value("${cn.springcloud.book.config}")
    String foo;
    @RequestMapping(value = "/getFoo")
    public String getFoo(){
        return foo;
    }
}
