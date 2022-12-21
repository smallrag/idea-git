package com.zzw.springcloud.alibaba;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 19:26
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 19:26
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
public class SeataAccountMainApp2003 {

    public static void main(String [] args){
        SpringApplication.run(SeataAccountMainApp2003.class,args);
    }
}
