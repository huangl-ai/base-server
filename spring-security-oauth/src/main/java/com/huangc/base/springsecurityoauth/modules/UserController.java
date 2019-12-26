package com.huangc.base.springsecurityoauth.modules;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: huangl
 * @Date: 2019/12/26 09:59
 * @Description:
 */
@Controller
public class UserController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello controller";
    }


    /**
     * 登录页，跳转到/templates/login.html页面
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 首页，跳转到/templates/index.html页面
     * @return
     */
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 当前用户信息
     * @param authentication
     * @return
     */
    @GetMapping("/info")
    @ResponseBody
    public Object getCurrentUser(Authentication authentication) {
        return authentication;
    }

}
