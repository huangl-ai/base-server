package com.huangc.servicefeign.modules.api;

import com.huangc.servicefeign.modules.api.service.CloudUserService;
import com.huangc.servicefeign.modules.api.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huangl
 * @Date: 2019/7/23 19:06
 * @Description:
 */
@RestController
public class ApiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    private CloudUserService cloudUserService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }

    @RequestMapping("getUsers")
    public String user(){

        return cloudUserService.getUser();
    }
}
