package com.zzw.springcloud.alibaba.dao;

import com.zzw.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zzw
 * @version 1.0
 * Create by 2022/12/19 23:36
 */
@Mapper
public interface OrderDao {
    //1.新建订单
    void create(Order order);

    //2.修改订单状态,从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
