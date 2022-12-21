package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/5 22:02
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/5 22:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {

    public static void main(String[] args){
        SpringApplication.run(PaymentMain8006.class,args);
    }
}
