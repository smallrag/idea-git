package com.zzw.springcloudalibaba.service;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/19 20:46
 */

import com.zzw.springcloud.entities.CommonResult;
import com.zzw.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/19 20:46
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
