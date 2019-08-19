package com.huangc.serviceribbon.modules.api;

import com.huangc.serviceribbon.modules.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huangl
 * @Date: 2019/7/23 18:08
 * @Description:
 */
@RestController
public class ApiController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
    @GetMapping(value = "/him")
    public String him(@RequestParam String name) {
        return helloService.himService( name );
    }
}
