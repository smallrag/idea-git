package com.zzw.springcloud.alibaba.controller;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/20 0:14
 */

import com.zzw.springcloud.alibaba.domain.CommonResult;
import com.zzw.springcloud.alibaba.domain.Order;
import com.zzw.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/20 0:14
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
