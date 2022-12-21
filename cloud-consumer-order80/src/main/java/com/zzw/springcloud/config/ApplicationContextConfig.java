package com.zzw.springcloud.config;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/3 20:10
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/3 20:10
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced //使用@LoadBalance注解赋予RestTemplate负载均衡的能力  轮询
public RestTemplate restTemplate(){
    return new RestTemplate();
}
}
