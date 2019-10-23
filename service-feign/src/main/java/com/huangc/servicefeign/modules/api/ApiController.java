package com.huangc.servicefeign.modules.api;

import com.huangc.servicefeign.modules.api.feign.CloService;
import com.huangc.servicefeign.modules.api.feign.CloudUserService;
import com.huangc.servicefeign.modules.api.service.HiService;
import com.huangc.servicefeign.modules.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: huangl
 * @Date: 2019/7/23 19:06
 * @Description:
 */
@RestController
public class ApiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    HiService hiService;

    @Autowired
    private CloudUserService cloudUserService;

    @Autowired
    private CloService cloService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHiFromClientOne( name );
    }

    @GetMapping(value = "/him")
    public String sayHim(@RequestParam String name) {
        return hiService.sayHiFromClientTwo( name );
    }

    @RequestMapping("/hime")
    @ResponseBody
    public Result homeOthere(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return hiService.sayHiFromClientTwoe(name);
    }

    @RequestMapping("/himd")
    @ResponseBody
    public Result homeOthered(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return hiService.sayHiFromClientTwoe(name);
    }

    @RequestMapping("getUsers")
    public String user(){

        return cloudUserService.getUser();
    }

    @RequestMapping("/user")
    @ResponseBody
    public Object user(@RequestParam(value = "id", defaultValue = "forezp") String id) {
        return cloService.getUser(id);
    }
    @RequestMapping("fallBack")
    public String fallBack(){

        return "a error happend!";
    }
}
