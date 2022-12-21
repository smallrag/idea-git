package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/9 16:38
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/9 16:38
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
public static void main(String[] args){
    SpringApplication.run(HystrixDashboardMain9001.class,args);
}
}
