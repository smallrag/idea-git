package com.zzw.springcloud.controller;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/15 12:51
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/15 12:51
 */
@RestController
@RefreshScope  //支持Nacos的动态刷新功能
public class ConfigClientController {
@Value("${config.info}")
    private String configInfo;

@GetMapping("/config/info")
public String getConfigInfo(){
    return configInfo;
}
}
