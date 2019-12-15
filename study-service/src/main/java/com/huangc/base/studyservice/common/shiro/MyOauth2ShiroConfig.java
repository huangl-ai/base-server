package com.huangc.base.studyservice.common.shiro;

import com.meiin.base.springboot.shiro.oauth2.OAuth2Realm;
import com.meiin.base.springboot.shiro.oauth2.Oauth2ShiroConfig;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @Description shiro控制器
 * @Author huzp
 * @Data 2018/12/11
 * @Version 1.0
 */
@Configuration
public class MyOauth2ShiroConfig extends Oauth2ShiroConfig {


    @Override
    public OAuth2Realm myShiroCasRealm(){
        return new MyShiroRealm();
    }

    @Override
    public void addAppUrlParttern(Map<String, String> filterChainDefinitionMap) {
    }



}
