package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/4 17:37
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/4 17:37
 */
@SpringBootApplication

public class OrderZKMain80 {
public static void main(String[] args){
    SpringApplication.run(OrderZKMain80.class,args);
}
}
