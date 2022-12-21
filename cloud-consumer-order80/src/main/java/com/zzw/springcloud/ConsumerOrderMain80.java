package com.zzw.springcloud;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/3 20:02
 */

import com.zzw.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/3 20:02
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class ConsumerOrderMain80{
public static void main(String[] args){
    SpringApplication.run(ConsumerOrderMain80.class,args);

}
}

