package com.zzw.springcloud.service;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/9 15:22
 */

import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/9 15:22
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , /(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return"-----PaymentFallbackService fall back-paymentInfo_TimeOut , /(ㄒoㄒ)/~~";
    }
}
