package com.zzw.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/6 22:19
 */
public interface LoadBalance {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);


}
