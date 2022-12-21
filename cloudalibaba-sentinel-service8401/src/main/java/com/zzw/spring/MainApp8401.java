package com.zzw.spring;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/17 23:43
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/17 23:43
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401 {
    public static void main(String[] args){
        SpringApplication.run(MainApp8401.class,args);
    }
}
