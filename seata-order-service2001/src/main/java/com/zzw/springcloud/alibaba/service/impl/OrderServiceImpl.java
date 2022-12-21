package com.zzw.springcloud.alibaba.service.impl;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/19 23:52
 */

import com.zzw.springcloud.alibaba.dao.OrderDao;
import com.zzw.springcloud.alibaba.domain.Order;
import com.zzw.springcloud.alibaba.service.AccountService;
import com.zzw.springcloud.alibaba.service.OrderService;
import com.zzw.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 * @version 1.0
 * Create by 2022/12/19 23:52
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private StorageService storageService;
    @Autowired
    private AccountService accountService;


    /**
     * 创建订单 调用库存服务扣减库存 调用账户服务扣减账户余额 修改订单状态
     * 简单说
     * 下订单 减库存 减余额 改状态
     * @param order
     */
    @Override
    @GlobalTransactional
    public void create(Order order) {
        log.info("----->开始新建订单");
        //1.新建订单
        orderDao.create(order);
        log.info("----->订单微服务开始调用库存,做扣减count");
        //2.扣减库存
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("----->订单微服务开始调用库存,做扣减end");
        log.info("----->订单微服务开始调用账户,做扣减money");
        //3.扣减账户
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----->订单微服务开始调用账户,做扣减end");
        //4.修改订单状态，从零到1 1代表已经完成
        log.info("------>修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("------>下订单结束了,(*^_^*)哈哈");
    }





    }

