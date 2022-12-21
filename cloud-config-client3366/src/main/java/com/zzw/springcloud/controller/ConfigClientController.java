package com.zzw.springcloud.controller;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/12 22:09
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/12 22:09
 */
@RestController
@RefreshScope
public class ConfigClientController {

@Value("${server.port}")
    private String serverPort;
@Value("${config.info}")
    private String configInfo;
@GetMapping("/configInfo")
    public String configInfo(){
    return "serverPort: "+serverPort+"\t\n\n configInfo: "+configInfo;
}

}
