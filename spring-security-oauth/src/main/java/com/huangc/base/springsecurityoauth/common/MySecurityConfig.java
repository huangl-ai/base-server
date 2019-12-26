package com.huangc.base.springsecurityoauth.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

/**
 * @Author: huangl
 * @Date: 2019/12/26 10:24
 * @Description: 配置登录拦截
 */
@Configuration
@EnableAuthorizationServer
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    AuthenticationFailureHandler authenticationFailureHandler;
    @Autowired
    MyAuthenticationSuccessHandler authenticationSuccessHandler;


/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                // 表单认证
                .formLogin()
                // 登录页
                .loginPage("/login")
//                .successHandler(authenticationSuccessHandler)
//                .failureHandler(authenticationFailureHandler)
                // 登录表单提交地址
                .loginProcessingUrl("/auth/login")
                .and()
                // 身份认证请求
                .authorizeRequests()
                // URL路径匹配
                .antMatchers("/login").permitAll()
                // 任意请求
                .anyRequest()
                // 身份认证
                .authenticated();
    }*/

    /**
     * 实现使用BCrypt强哈希函数的密码编码器。客户机可以选择性地提供“强度”(即BCrypt中的日志轮数)和SecureRandom 实例。
     * 强度参数越大，需要做的工作就越多(指数级)来散列密码。默认值是10。
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
