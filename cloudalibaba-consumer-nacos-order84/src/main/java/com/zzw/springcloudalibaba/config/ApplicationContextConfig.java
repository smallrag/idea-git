package com.zzw.springcloudalibaba.config;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/19 19:27
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/19 19:27
 */
@Configuration
public class ApplicationContextConfig {
@Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
    return new RestTemplate();
}

}
