package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/15 12:50
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/15 12:50
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigMain3377 {

public static void main(String [] args){
    SpringApplication.run(NacosConfigMain3377.class,args);
}

}
