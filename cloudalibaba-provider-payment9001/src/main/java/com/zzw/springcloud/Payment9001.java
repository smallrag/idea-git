package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/15 10:54
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/15 10:54
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9001 {
public static void main(String [] args){
    SpringApplication.run(Payment9001.class,args);
        }

}
