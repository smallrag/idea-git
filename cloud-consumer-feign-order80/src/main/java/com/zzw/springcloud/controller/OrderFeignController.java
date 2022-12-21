package com.zzw.springcloud.controller;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/8 11:04
 */

import com.zzw.springcloud.entities.CommonResult;
import com.zzw.springcloud.entities.Payment;
import com.zzw.springcloud.service.PaymentFeignService;
import feign.Param;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/8 11:04
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        String s = paymentFeignService.paymentFeignTimeout();
        return s;
    }
}
