package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/8 10:50
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/8 10:50
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
