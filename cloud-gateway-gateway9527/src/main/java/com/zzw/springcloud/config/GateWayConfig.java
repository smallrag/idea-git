package com.zzw.springcloud.config;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/9 18:24
 */

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/9 18:24
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
       //https://news.baidu.com/guonei
        routes.route("path,route_zzw",r -> r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
        return routes.build();
}
    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //https://news.baidu.com/guonei
        routes.route("path,route_zzw2",r -> r.path("/bilibili").uri("https://game.bilibili.com/platform/?spm_id_from=..0.0")).build();
        return routes.build();
    }
}
