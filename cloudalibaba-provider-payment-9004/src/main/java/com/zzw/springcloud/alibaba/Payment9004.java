package com.zzw.springcloud.alibaba;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/19 19:47
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/19 19:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9004
{
    public static void main(String[] args) {
        SpringApplication.run(Payment9004.class, args);
    }
}