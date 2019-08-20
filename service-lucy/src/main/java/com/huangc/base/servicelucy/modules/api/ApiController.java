package com.huangc.base.servicelucy.modules.api;

import com.huangc.base.servicelucy.modules.api.feign.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huangl
 * @Date: 2019/8/20 14:56
 * @Description:
 */
@RestController
public class ApiController {

    @Autowired
    private ServiceHi serviceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceHi.sayHi( name );
    }

    @GetMapping(value = "/him")
    public String sayHim(@RequestParam String name) {
        return serviceHi.sayHim( name );
    }
}
