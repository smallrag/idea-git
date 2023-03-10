package com.zzw.springcloud.controller;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/11/30 21:43
 */

import com.zzw.springcloud.entities.CommonResult;
import com.zzw.springcloud.entities.Payment;
import com.zzw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果"+result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,result);
        }
        else{
            return new CommonResult(444,"插入数据库失败",result);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询数据库成功,serverPort: "+serverPort,payment);
        }
        else{
            return new CommonResult(444,"没有对应记录,查询ID："+id,null);
        }
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
