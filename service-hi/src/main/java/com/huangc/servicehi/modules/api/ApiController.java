package com.huangc.servicehi.modules.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huangl
 * @Date: 2019/7/24 14:48
 * @Description:
 */
@RestController
public class ApiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    @ResponseBody
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:"+ port ;
    }

    @RequestMapping("/him")
    @ResponseBody
    public String homeOther(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hescim " + name + " ,i am from port:"+ port ;
    }
}
