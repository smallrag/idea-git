package com.zzw.springcloud.config;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/8 11:53
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author
 * @version 1.0
 * Create by 2022/12/8 11:53
 */
@Configuration
public class FeginConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
