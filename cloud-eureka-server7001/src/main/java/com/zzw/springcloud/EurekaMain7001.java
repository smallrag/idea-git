package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/3 21:25
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/3 21:25
 *
 * 配置Eureka 服务端
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }

}
