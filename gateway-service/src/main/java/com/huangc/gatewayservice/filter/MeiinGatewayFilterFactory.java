package com.huangc.gatewayservice.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther: huangl
 * @Date: 2019/7/24 15:31
 * @Description:
 */
@Component
public class MeiinGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {
    @Override
    public GatewayFilter apply(Object config) {
        return new MeiinGatewayFilter();
    }
}
