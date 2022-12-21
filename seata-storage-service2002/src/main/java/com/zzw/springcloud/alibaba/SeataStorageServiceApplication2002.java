package com.zzw.springcloud.alibaba;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:13
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 19:13
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
public class SeataStorageServiceApplication2002 {
    public static void main(String[] args){
        SpringApplication.run(SeataStorageServiceApplication2002.class,args);
    }
}
