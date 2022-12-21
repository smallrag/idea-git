package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/15 11:19
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/15 11:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002 {
public static void main(String[] args){

    SpringApplication.run(Payment9002.class,args);
}

}
