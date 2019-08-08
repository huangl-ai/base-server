package com.huangc.gatewayservice.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

/**
 * @Auther: huangl
 * @Date: 2019/7/24 10:02
 * @Description:
 */
public class MeiinGatewayFilter implements GatewayFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest req = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();
        URI requestUri = req.getURI();
        String path = requestUri.getPath();
        String[] paths = path.substring(1).split("/");
        System.out.println("paths="+paths);
        return chain.filter(exchange.mutate().request(req).build());
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
