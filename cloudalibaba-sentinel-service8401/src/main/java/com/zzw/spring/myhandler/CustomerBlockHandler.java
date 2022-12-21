package com.zzw.spring.myhandler;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/18 22:22
 */

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zzw.springcloud.entities.CommonResult;
import com.zzw.springcloud.entities.Payment;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/18 22:22
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException exception){

        return new CommonResult(444,"按客户自定义,global handlerException-----1",new Payment(2020L,"serial003"));
    }
    public static CommonResult handlerException2(BlockException exception){

        return new CommonResult(444,"按客户自定义,global handlerException-----2",new Payment(2020L,"serial003"));
    }
}
