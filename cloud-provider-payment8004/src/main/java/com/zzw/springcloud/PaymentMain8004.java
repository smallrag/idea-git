package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/4 16:33
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/4 16:33
 */
@SpringBootApplication
@EnableDiscoveryClient//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
public static void main(String[] args){
    SpringApplication.run(PaymentMain8004.class,args);
}

}
