package com.zzw.springcloud.service;

import com.zzw.springcloud.entities.CommonResult;
import com.zzw.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/8 10:57
 */
@Component
@FeignClient(value ="CLOUD-PAYMENT-SERVICE" )
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
