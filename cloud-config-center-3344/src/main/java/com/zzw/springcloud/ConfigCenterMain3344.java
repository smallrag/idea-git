package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/10 2:35
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/10 2:35
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
