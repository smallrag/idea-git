package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/12 14:25
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/12 14:25
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355 {
public static void main(String[] args){
    SpringApplication.run(ConfigClientMain3355.class,args);
}
}
