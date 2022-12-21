package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/15 11:34
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/15 11:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
public  static void main(String[] args){
    SpringApplication.run(OrderNacosMain83.class,args);
}

}
