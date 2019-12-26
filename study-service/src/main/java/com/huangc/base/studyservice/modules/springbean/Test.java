package com.huangc.base.studyservice.modules.springbean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import static net.bull.javamelody.internal.common.Parameters.getServletContext;

/**
 * @Author: huangl
 * @Date: 2019/12/16 22:23
 * @Description:
 */
public class Test implements ApplicationContextAware {

    public static void main(String[] args) {
        WebApplicationContext webAppContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        
    }
}
