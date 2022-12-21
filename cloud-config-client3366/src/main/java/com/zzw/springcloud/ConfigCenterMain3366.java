package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/12 22:07
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/12 22:07
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigCenterMain3366 {
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigCenterMain3366.class,args);
    }
}
