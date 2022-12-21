package com.zzw.springcloud.dao;/**
 * @author zzw
 * @version 1.0
 * Create by 2022/11/30 21:22
 */

import com.zzw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author
 * @version 1.0
 * Create by 2022/11/30 21:22
 */
@Mapper
public interface PaymentDao {
    //新增
    public int create (Payment payment);
    //查
    public  Payment getPaymentById(@Param("id") Long id);

}
